package com.demo.catalogue_service.controller;

import com.demo.catalogue_service.entity.CatalogueEntity;
import com.demo.catalogue_service.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogue")
public class CatalogueController {

    @Autowired
    private CatalogueService catalogueService;

    // Endpoint to get all product types
    @GetMapping("/product-types")
    public ResponseEntity<List<CatalogueEntity>> getAllProductTypes() {
        List<CatalogueEntity> productTypes = catalogueService.getAllProductType();
        return new ResponseEntity<>(productTypes, HttpStatus.OK);
    }

    // Endpoint to add a new product type
    @PostMapping("/product-type")
    public ResponseEntity<CatalogueEntity> addNewProductType(@RequestBody CatalogueEntity newProductType) {
        CatalogueEntity addedProductType = catalogueService.addNewProductType(newProductType);
        return new ResponseEntity<>(addedProductType, HttpStatus.CREATED);
    }

    // Endpoint to get a product type by ID
    @GetMapping("/product-type/{id}")
    public ResponseEntity<CatalogueEntity> getProductTypeById(@PathVariable Long id) {
        CatalogueEntity productType = catalogueService.getProductTypeById(id);
        if (productType != null) {
            return new ResponseEntity<>(productType, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
