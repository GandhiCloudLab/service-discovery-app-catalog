package com.idepo.catalogservice.service;

import com.idepo.catalogservice.common.LogUtil;
import com.idepo.catalogservice.data.StockData;
import com.idepo.catalogservice.util.HttpClientUtil;
import com.idepo.catalogservice.util.JsonUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


@Configuration
@Service
public class StockService {

    @Value("${service.url.stock}")
    private String url_stock;

    public StockData getStockByCatalogshortid(String catalogshortid) {
        LogUtil.log("StockService  getStock Started ");

        String url = url_stock + "/api/stockByCatalogshortid?catalogshortid=" + catalogshortid ;
        LogUtil.log("StockService  getStock  : url " + url);

        StockData result = null;
        try {
            String jsonString = HttpClientUtil.doGet(url);
            LogUtil.log("StockService : getStock jsonString  : " + jsonString);

            result =  (StockData) JsonUtil.jsonToObject(jsonString, StockData.class);
            LogUtil.log("StockService : getStock result  : " + result);
        } catch (Exception e) {
            LogUtil.log("StockService : getStock error catalogshortid :" + catalogshortid);
            e.printStackTrace();
        }

        LogUtil.log("StockService  getStock Completed : ");
        return result;
    }

}
