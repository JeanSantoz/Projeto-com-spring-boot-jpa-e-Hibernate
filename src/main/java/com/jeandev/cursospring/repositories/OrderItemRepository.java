package com.jeandev.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeandev.cursospring.entities.OrderItem;
import com.jeandev.cursospring.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
    
}
