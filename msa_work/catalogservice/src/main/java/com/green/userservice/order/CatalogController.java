package com.green.userservice.order;

import com.green.userservice.order.service.CatalogService;
import com.green.userservice.order.vo.CatalogRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class CatalogController {

    private final CatalogService userService;

    @PostMapping("join")
    public ResponseEntity<UserResponse> joinUser(@RequestBody CatalogRequest catalogRequest) {

        UserResponse userResponse = userService.join(catalogRequest);
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
