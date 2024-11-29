package com.green.userservice.order.vo;

import lombok.Data;

@Data
public class OrderResponse {

    private String accessToken;
    private String refreshToken;
    private String userId;
    private String email;

}