package io.github.henriquesabino.workshopmongo.resources;

import io.github.henriquesabino.workshopmongo.domain.Post;
import io.github.henriquesabino.workshopmongo.resources.util.URL;
import io.github.henriquesabino.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {
    
    @Autowired
    PostService service;
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post post = service.findById(id);
        return ResponseEntity.ok().body(post);
    }
    
    @GetMapping(value = "/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam String text) {
        text = URL.decodeParam(text);
        List<Post> list = service.findByTitle(text);
        
        return ResponseEntity.ok().body(list);
    }
}
