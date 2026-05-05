package org.example.webservice.repositories;

import org.example.webservice.entitites.Category;
import org.example.webservice.entitites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
