package com.demo.catalogue_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.catalogue_service.entity.CatalogueEntity;
import com.demo.catalogue_service.repository.CatalogueRepository;

@Service
public class CatalogueService {

    @Autowired
    private CatalogueRepository catalogueRepository;

    public List<CatalogueEntity> getAllProductType(){
        return catalogueRepository.findAll();
    }

    public CatalogueEntity addNewProductType(CatalogueEntity newProductType){
        return catalogueRepository.saveAndFlush(newProductType);
    }

}
