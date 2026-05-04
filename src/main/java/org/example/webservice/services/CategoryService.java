package org.example.webservice.services;

import org.example.webservice.entitites.Category;
import org.example.webservice.entitites.Category;

import org.example.webservice.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll()
    {
        return repository.findAll();
    }

    public Category findById(Long id)
    {
        Optional<Category> Categorys = repository.findById(id);
        return Categorys.get();
    }

    public void saveAll(List<Category> list) {
    }
}
