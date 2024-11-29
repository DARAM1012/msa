package com.catalog.service;

import com.catalog.vo.CatalogResponse;
import com.catalog.vo.CatalogRequest;

import java.util.List;


public interface CatalogService {

    List<CatalogResponse> getCatalogs();
    CatalogResponse modifyCatalog(CatalogRequest catalogRequest);

}