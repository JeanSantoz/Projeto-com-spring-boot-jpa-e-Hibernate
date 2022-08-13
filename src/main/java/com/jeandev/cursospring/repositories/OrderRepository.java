package com.jeandev.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeandev.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
