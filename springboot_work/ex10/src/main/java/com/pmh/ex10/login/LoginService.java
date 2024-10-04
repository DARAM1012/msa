package com.pmh.ex10.login;

import com.pmh.ex10.User.User;
import com.pmh.ex10.User.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    public void join(JoinDto joinDto){

        User user = modelMapper.map(joinDto, User.class);
//        username -> name
        user.setName(joinDto.getUsername());
//        암호화
        user.setPassword(passwordEncoder.encode(joinDto.getPassword()));

//        일단 관리자로만 로그인하겠다고 설정함.
        user.setRole("ROLE_ADMIN");

        User dbUser = userRepository.save(user);
        System.out.println(dbUser);
    }
}
