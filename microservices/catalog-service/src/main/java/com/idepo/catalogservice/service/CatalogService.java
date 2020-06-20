package com.idepo.catalogservice.service;

import com.idepo.catalogservice.entity.Catalog;
import com.idepo.catalogservice.jpa.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogService {

    @Autowired
    CatalogRepository repository;
    @Autowired
    StockService stockService;

    public List<Catalog> getAll() {
        List<Catalog> list = new ArrayList();
        repository.findAll().forEach(item -> list.add(item));
        return list;
    }

    public List<Catalog> getAllByShortid(String shortid) {
        List<Catalog> list = new ArrayList();
        repository.findByShortid(shortid).forEach(item -> list.add(item));
        return list;
    }
}
