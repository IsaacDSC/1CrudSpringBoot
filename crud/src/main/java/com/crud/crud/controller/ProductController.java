package com.crud.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crud.model.ProductModel;
import com.crud.crud.service.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ProductModel>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
    }

    @PostMapping
    public ResponseEntity<ProductModel> create(@RequestBody ProductModel product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
    }

    @PutMapping
    public ResponseEntity<ProductModel> update(@RequestBody ProductModel product){
        return ResponseEntity.status(HttpStatus.OK).body(productService.update(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        productService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
