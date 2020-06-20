package com.idepo.catalogservice.jpa;

import com.idepo.catalogservice.entity.Catalog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CatalogRepository extends CrudRepository<Catalog, Integer> {

    List<Catalog> findByShortid(String shortId);

}

