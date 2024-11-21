package com.patricia.cache.repository;

import com.patricia.cache.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Component
@Slf4j
public class ProductRepository {
    public List<Product> listAll(){
        log.info("c=ProductRepository, m=listAll");

        //Simulando retorno banco de dados
        //final Product product = new Product("1234","computador",new BigDecimal(1000));
        //com o builder nao precisa de preocupar quando criar um novo atributo ou muda a order dos dados
        final Product product1 = Product.builder()
                .sku("product123")
                .description("computador positivo")
                .price(new BigDecimal(2500))
                .build();
        final Product product2 = Product.builder()
                .sku("product543")
                .description("computador ASUS")
                .price(new BigDecimal(3100))
                .build();

        final Product product3 = Product.builder()
                .sku("product789")
                .description("computador DELL")
                .price(new BigDecimal(4500))
                .build();

        final Product product4 = Product.builder()
                .sku("product444")
                .description("computador HP")
                .price(new BigDecimal(6300))
                .build();

        return List.of(product1,product2,product3);
    }
}
