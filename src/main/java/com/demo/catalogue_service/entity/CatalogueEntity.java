package com.demo.catalogue_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="catalogue_details")
public class CatalogueEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="catalogue_id")
    private Long catalogueId;
    @Column(name="product_category")
    private String productCategory;
    @Column(name="product_price")
    private Double productPrice;
    @Column(name="product_image_url")
    private String productImageUrl;
    @Column(name="product_workload")
    private int productWorkload;

}
