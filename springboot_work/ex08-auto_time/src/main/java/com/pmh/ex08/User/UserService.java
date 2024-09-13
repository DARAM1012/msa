package com.pmh.ex08.User;

import com.pmh.ex08.error.BizException;
import com.pmh.ex08.error.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // email 중복이면 에러코드.
    // email 중복이 아니면 insert 정상적으로 입력
    public void insert(UserReDto userReDto) {

        Optional<User> optionalUser = userRepository.findByEmail((userReDto.getEmail()));
        optionalUser.ifPresent(user -> {
            throw new BizException(ErrorCode.DUPLICATE_USERS);
        });
        
        System.out.println("실행" + userReDto);
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReDto, User.class);
        System.out.println("user = " + user);
        userRepository.save(user);
    }
}
