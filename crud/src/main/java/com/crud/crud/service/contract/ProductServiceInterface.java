package com.crud.crud.service.contract;

import java.util.List;
import java.util.Optional;



import com.crud.crud.model.ProductModel;

public interface ProductServiceInterface {
    ProductModel save(ProductModel product);

    List<ProductModel> findAll();

    Optional<ProductModel> findById(Long id);

    ProductModel update(ProductModel product);

    void deleteById(Long id);
}
