package org.example.webservice.repositories;

import org.example.webservice.entitites.Category;
import org.example.webservice.entitites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
