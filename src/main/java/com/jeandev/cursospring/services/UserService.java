package com.jeandev.cursospring.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.jeandev.cursospring.entities.User;
import com.jeandev.cursospring.repositories.UserRepository;
import com.jeandev.cursospring.services.exceptions.DatabaseException;
import com.jeandev.cursospring.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> x = repository.findById(id);
        return x.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user){
        return repository.save(user);
    }

    public void delete(Long id){
        try{
            repository.deleteById(id);
        }
        catch(EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }
        catch(DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
        
    }

    public User update(Long id, User user){
        try{
            User entity = repository.getOne(id);
            updateData(entity, user);
            return repository.save(entity);
        }
        catch(EntityNotFoundException e){
            e.getMessage();
            throw new ResourceNotFoundException(id);
        }
        
    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }

}
