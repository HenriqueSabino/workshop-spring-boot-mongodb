package io.github.henriquesabino.workshopmongo.dto;

import io.github.henriquesabino.workshopmongo.domain.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {
    
    private static final long serialVersionUID = 8879256364141049781L;
    
    private String id;
    private String name;
    
    public AuthorDTO() {
    }
    
    public AuthorDTO(User user) {
        id = user.getId();
        name = user.getName();
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
