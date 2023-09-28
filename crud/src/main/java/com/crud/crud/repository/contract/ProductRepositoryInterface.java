package com.crud.crud.repository.contract;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud.model.ProductModel;

public interface ProductRepositoryInterface extends JpaRepository<ProductModel, Long> {

}
