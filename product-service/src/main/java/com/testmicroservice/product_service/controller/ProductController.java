package com.testmicroservice.product_service.controller;

import com.testmicroservice.product_service.dto.ProductRequest;
import com.testmicroservice.product_service.dto.ProductResponce;
import com.testmicroservice.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    public final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void created(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponce> getAllProducts(){
        return productService.getAllProducts();
    }

}
