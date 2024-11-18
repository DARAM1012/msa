package com.green.userservice.order.service;

import com.green.userservice.order.vo.CatalogRequest;


public interface CatalogService {
    UserResponse join(CatalogRequest catalogRequest);
    UserResponse login(String email, String password);
}
