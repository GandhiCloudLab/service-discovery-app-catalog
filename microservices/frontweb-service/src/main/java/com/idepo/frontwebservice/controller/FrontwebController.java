package com.idepo.frontwebservice.controller;

import com.idepo.frontwebservice.service.FrontwebService;
import com.idepo.frontwebservice.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontwebController {

    @Autowired
    FrontwebService service;

    @RequestMapping("/")
    private ModelAndView welcome() {
        String result = "Welcome to Frontweb service .. ..." ;
        System.out.println(result);
        return new ModelAndView("welcome");
    }

    @RequestMapping("/frontweb/catalog")
    private ModelAndView catalog () {
        LogUtil.log(("FrontwebController catalog"));
        Object result = service.catalog();
        LogUtil.log(("FrontwebController catalog : " + result));
        ModelAndView modelAndView = new ModelAndView("cataloglist");
        modelAndView.addObject("cataloglist1", result);
        return modelAndView;
    }

    @RequestMapping("/frontweb/catalogNames")
    private ModelAndView catalogNames () {
        LogUtil.log(("FrontwebController catalogNames"));
        Object result = service.catalogNames();
        LogUtil.log(("FrontwebController catalogNames : " + result));
        ModelAndView modelAndView = new ModelAndView("catalog");
        modelAndView.addObject("cataloglist", result);
        return modelAndView;
    }

}
