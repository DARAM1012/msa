package com.pmh.org.login;

import com.pmh.org.user.User;
import com.pmh.org.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoginService implements UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    // 회원가입
    public void join(JoinDto joinDto) {
        User user = modelMapper.map(joinDto, User.class);
        user.setPassword(
                passwordEncoder.encode(joinDto.getPassword())
        );
        user.setRole("ROLE_ADMIN");
        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        // email 체크...
        User user = userRepository.findByEmail(username).orElseThrow(
                () -> new UsernameNotFoundException(username)
        );

//        return org.springframework.security.core.userdetails
//                .User
//                .builder()
//                .username(user.getEmail())
//                .password(user.getPassword())
//                .roles("ADMIN")
//                .build();

        // password 체크...
        return new LoginUserDetails(user.getEmail(),
                                    user.getPassword(),
                                    user.getRole());
    }
}













