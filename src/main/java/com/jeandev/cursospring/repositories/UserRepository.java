package com.jeandev.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeandev.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
