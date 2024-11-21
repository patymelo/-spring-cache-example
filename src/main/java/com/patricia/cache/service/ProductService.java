package com.patricia.cache.service;

import com.patricia.cache.entity.Product;
import com.patricia.cache.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    @Cacheable("product-cache")
    public List<Product> listAll(){
        log.info("c=ProductService, m=listAll");
        return productRepository.listAll();
    }
}
