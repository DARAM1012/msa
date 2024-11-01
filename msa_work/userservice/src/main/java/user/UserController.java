package user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.vo.UserResponse;


@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    @GetMapping("join")
    public ResponseEntity<UserResponse> joinUser() {
        return ResponseEntity.ok(null);

    }

    @GetMapping("login")
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("kakaologin")
    public ResponseEntity<String> kakaoLogin() {
        return ResponseEntity.ok(null);
    }
}
