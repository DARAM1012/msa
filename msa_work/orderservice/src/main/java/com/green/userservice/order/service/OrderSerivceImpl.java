package com.green.userservice.order.service;

import com.green.userservice.error.orderException;
import com.green.userservice.jwt.JwtUtils;
import com.green.userservice.order.jpa.OrderEntity;
import com.green.userservice.order.jpa.OrderRepository;
import com.green.userservice.order.vo.OrderRequest;
import com.green.userservice.order.vo.UserResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderSerivceImpl implements OrderService {

    private final OrderRepository userRepository; // UserRepository dependency injection
    private final JwtUtils jwtUtils;

    @Override
    public UserResponse join(OrderRequest orderRequest) {
        String reqEmail = orderRequest.getEmail();

        userRepository.findByEmail(reqEmail)
                .ifPresent(user -> {
                    throw new orderException(String.format("이미 존재하는 email 메일입니다 \n회원가입 할 수 없습니다.%s", reqEmail));
                });

        ModelMapper mapper = new ModelMapper();
        OrderEntity userEntity = mapper.map(orderRequest, OrderEntity.class);
        userEntity.setUserId(UUID.randomUUID().toString());
        userEntity = userRepository.save(userEntity); // UserRepository 에서 UserEntity를 저장

        UserResponse userResponse = mapper.map(userEntity,UserResponse.class);

        return userResponse;
    }

    @Override
    public UserResponse login(String email, String password) {

        // email password 확인 하고 틀리면 Exception 처리
        OrderEntity userEntity =
                userRepository.findByEmailAndPassword(email, password)
                        .orElseThrow(
                                () ->
                                new orderException("Invalid email or password")
                        );
        // 로그인한 유저가 있으면 loginResponse 객체 생성해서 controller에 반환
        UserResponse loginResponse = new UserResponse();
        loginResponse.setUserId(userEntity.getUserId());
        loginResponse.setAccessToken(jwtUtils.createAccessToken(userEntity.getEmail(), userEntity.getUserId()));
        loginResponse.setRefreshToken(jwtUtils.createRefreshToken(userEntity.getEmail()));
        loginResponse.setEmail(userEntity.getEmail());

        return loginResponse;
    }
}
