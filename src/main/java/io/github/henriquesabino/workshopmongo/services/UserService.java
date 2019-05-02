package io.github.henriquesabino.workshopmongo.services;

import io.github.henriquesabino.workshopmongo.domain.User;
import io.github.henriquesabino.workshopmongo.dto.UserDTO;
import io.github.henriquesabino.workshopmongo.repository.UserRepository;
import io.github.henriquesabino.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repo;
    
    public List<User> findAll(){
        return repo.findAll();
    }
    
    public User findById(String id){
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
    
    public User insert(User user){
        return repo.insert(user);
    }
    
    public User fromDTO(UserDTO userDTO){
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
