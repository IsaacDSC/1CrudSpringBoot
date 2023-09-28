package com.crud.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crud.model.ProductModel;
import com.crud.crud.repository.contract.ProductRepositoryInterface;
import com.crud.crud.service.contract.ProductServiceInterface;

@Service
public class ProductService implements ProductServiceInterface {
    @Autowired
    private ProductRepositoryInterface productRepository;

    @Override
    public ProductModel save(ProductModel product) {
        return productRepository.save(product);
    }

    @Override
    public List<ProductModel> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductModel> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public ProductModel update(ProductModel product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

}
