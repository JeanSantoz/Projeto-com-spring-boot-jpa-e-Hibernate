package com.jeandev.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeandev.cursospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
