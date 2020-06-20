package com.idepo.catalogservice.controller;

import com.idepo.catalogservice.common.LogUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RootController {

    @GetMapping("/")
    private String root () {
        LogUtil.log("RootController called ... ");
        return "Welcome to Catalog service!!!";
    }

}
