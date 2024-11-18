package com.green.userservice.order;

import com.green.userservice.order.service.OrderService;
import com.green.userservice.order.vo.OrderRequest;
import com.green.userservice.order.vo.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final OrderService userService;

    @PostMapping("join")
    public ResponseEntity<UserResponse> joinUser(@RequestBody OrderRequest orderRequest) {

        UserResponse userResponse = userService.join(orderRequest);
        System.out.println(userResponse);
        return ResponseEntity.ok(userResponse);
    }

    @GetMapping("login")
    public ResponseEntity<OrderResponse> getUser(
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password) {

        OrderResponse loginResponse = userService.login(email,password);

        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping("kakaologin")
    public ResponseEntity<String> kakaoLogin() {
        return ResponseEntity.ok(null);
    }

}
