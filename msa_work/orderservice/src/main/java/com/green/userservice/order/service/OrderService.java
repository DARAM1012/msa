package com.green.userservice.order.service;

import com.green.userservice.order.vo.OrderRequest;
import com.green.userservice.order.vo.UserResponse;


public interface OrderService {
    UserResponse join(OrderRequest orderRequest);
    UserResponse login(String email, String password);
}
