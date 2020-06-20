package com.idepo.catalogservice.controller;

import com.idepo.catalogservice.data.CatalogData;
import com.idepo.catalogservice.entity.Catalog;
import com.idepo.catalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api")
public class CatalogController {

    @Autowired
    CatalogService service;

    @GetMapping("/catalog")
    private List<Catalog> getAll() {
        return service.getAll();
    }

    @GetMapping("catalogByShortid")
    private List<Catalog> getAllByCatalogshortid(@RequestParam("shortid") String shortid) {
        return service.getAllByShortid(shortid);
    }

    @GetMapping("/catalogNames")
    private List<String> getAllNames() {

        List<String> list = new ArrayList();
        for (Catalog catalog : service.getAll()) {
            list.add(catalog.getDescription());
        }
        return list;
    }

}

