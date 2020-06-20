package com.idepo.frontwebservice.controller;

import com.idepo.frontwebservice.util.MyUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


@Configuration
@CrossOrigin
@RestController
public class RootController {

    int i = 1;


    @GetMapping("/hello")
    private String hello() {
        String result = "hello front web service" ;
        System.out.println(result);
        return result;
    }

    @GetMapping("/latencyCheck")
    private String latencyCheck() {
        System.out.println("latency check ... started");
        MyUtil.sleepForSomeTime();
        System.out.println("latency check ... completed") ;
        return "latencyCheck success";
    }

    @GetMapping("/errorCheck")
    private String errorCheck() {
        System.out.println("error check ... started");

        if (i==1) {
            i = 2 ;
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found .......", new Exception(""));
        } else if (i==2) {
            i = 3;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Bad Request .......", new Exception(""));
        } else if (i==3) {
            i = 4;
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Bad Gateway ......", new Exception(""));
        } else if (i==4) {
            i = 5;
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Conflict .....", new Exception(""));
        } else if (i==5) {
            i = 6;
            throw new ResponseStatusException(HttpStatus.GATEWAY_TIMEOUT, "Gateway timeout .......", new Exception(""));
        } else {
            i = 1;
        }

        return "errorCheck success";
    }
}
