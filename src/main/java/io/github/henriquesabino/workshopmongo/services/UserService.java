package io.github.henriquesabino.workshopmongo.services;

import io.github.henriquesabino.workshopmongo.domain.User;
import io.github.henriquesabino.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repo;
    
    public List<User> findAll(){
        return repo.findAll();
    }
}
