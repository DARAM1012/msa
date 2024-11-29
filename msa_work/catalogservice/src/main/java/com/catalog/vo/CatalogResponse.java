package com.catalog.vo;

import lombok.Data;

@Data
public class CatalogResponse {

    private Long id;
    private String productId;
    private String userId;
    private String email;

}
