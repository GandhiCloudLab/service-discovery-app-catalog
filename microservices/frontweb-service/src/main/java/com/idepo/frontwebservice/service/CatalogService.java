package com.idepo.frontwebservice.service;

import com.idepo.frontwebservice.util.HttpClientUtil;
import com.idepo.frontwebservice.util.LogUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class CatalogService {

    @Value("${service.url.catalog}")
    private String url_service;

    public Object catalog() {
        LogUtil.log("CatalogService  catalog Started ");

        String url = url_service + "/api/catalog";
        LogUtil.log("CatalogService  catalog  : url " + url);

        Object result = null;
        try {
            result = HttpClientUtil.doGet(url);
            LogUtil.log("CatalogService : catalog result  : " + result);
        } catch (Exception e) {
            LogUtil.log("CatalogService : catalog error ");
            e.printStackTrace();
        }
        LogUtil.log("CatalogService  catalog Completed");
        return result;
    }

    public Object catalogNames() {
        LogUtil.log("CatalogService  catalogNames Started ");

        String url = url_service + "/api/catalogNames";
        LogUtil.log("CatalogService  catalogNames  : url " + url);

        Object result = null;
        try {
            result = HttpClientUtil.doGet(url);
            LogUtil.log("CatalogService : catalogNames result  : " + result);
        } catch (Exception e) {
            LogUtil.log("CatalogService : catalogNames error ");
            e.printStackTrace();
        }
        LogUtil.log("CatalogService  catalogNames Completed");
        return result;
    }
}
