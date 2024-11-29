package com.catalog;

import com.catalog.service.CatalogService;
import com.catalog.vo.CatalogResponse;
import com.catalog.vo.CatalogRequest;
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
    public ResponseEntity<CatalogResponse> getUser(
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password) {

        CatalogResponse catalogResponse = userService.login(email,password);

        return ResponseEntity.ok(catalogResponse);
    }

    @GetMapping("kakaologin")
    public ResponseEntity<String> kakaoLogin() {
        return ResponseEntity.ok(null);
    }

}
