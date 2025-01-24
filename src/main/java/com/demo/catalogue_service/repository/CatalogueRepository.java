package com.demo.catalogue_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.catalogue_service.entity.CatalogueEntity;

@Repository
public interface CatalogueRepository extends JpaRepository<CatalogueEntity,Long>{

}
