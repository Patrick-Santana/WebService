package org.example.webservice.repositories;

import org.example.webservice.entitites.Order;
import org.example.webservice.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
