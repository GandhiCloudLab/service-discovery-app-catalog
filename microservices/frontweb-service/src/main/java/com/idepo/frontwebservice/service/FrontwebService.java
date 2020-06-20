package com.idepo.frontwebservice.service;

import com.idepo.frontwebservice.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class FrontwebService {

    @Autowired
    CatalogService catalogService;

    public Object catalog () {
        LogUtil.log(("FrontwebService  catalog ... "));
        return catalogService.catalog();
    }
    public Object catalogNames () {
        LogUtil.log(("FrontwebService  catalogNames ... "));
        return catalogService.catalogNames();
    }

}
