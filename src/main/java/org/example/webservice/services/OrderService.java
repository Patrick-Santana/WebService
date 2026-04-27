package org.example.webservice.services;

import org.example.webservice.entitites.Order;

import org.example.webservice.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll()
    {
        return repository.findAll();
    }

    public Order findById(Long id)
    {
        Optional<Order> orders = repository.findById(id);
        return orders.get();
    }
}
