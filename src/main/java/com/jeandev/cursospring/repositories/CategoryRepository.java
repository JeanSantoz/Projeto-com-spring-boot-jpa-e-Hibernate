package com.jeandev.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeandev.cursospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
