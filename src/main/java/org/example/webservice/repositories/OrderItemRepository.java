package org.example.webservice.repositories;

import org.example.webservice.entitites.Order;
import org.example.webservice.entitites.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
