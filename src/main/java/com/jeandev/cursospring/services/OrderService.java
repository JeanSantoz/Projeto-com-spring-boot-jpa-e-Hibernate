package com.jeandev.cursospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeandev.cursospring.entities.Order;
import com.jeandev.cursospring.repositories.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> x = repository.findById(id);
        return x.get();
    }

}
