package io.github.henriquesabino.workshopmongo.services;

import io.github.henriquesabino.workshopmongo.domain.Post;
import io.github.henriquesabino.workshopmongo.repository.PostRepository;
import io.github.henriquesabino.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    
    @Autowired
    private PostRepository repo;
    
    public Post findById(String id) {
        Optional<Post> post = repo.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
    
    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }
}
