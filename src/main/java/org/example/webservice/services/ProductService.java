package org.example.webservice.services;

import org.example.webservice.entitites.Product;
import org.example.webservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll()
    {
        return repository.findAll();
    }

    public Product findById(Long id)
    {
        Optional<Product> Product = repository.findById(id);
        return Product.get();
    }
}
