package com.example.org.kakao;


import io.swagger.v3.oas.models.PathItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("kakao")
@Slf4j
public class KakaoController {

    @GetMapping("login")
    public String kakaoCode(@RequestParam(name="code") String code){
        log.info("code {}",code);

        // 1.restTemplate
        try {
            String url = "https://kauth.kakao.com/oauth/token";

            RestTemplate RestTemplate = new RestTemplate();

            HttpEntity<String> resquestEntity = new HttpEntity<>("");

            restTemplate.exchange(url, PathItem.HttpMethod.POST,null);
        }catch (Exception e) {
            e.printStackTrace();
        }

        return "kakao code";
    }
}
