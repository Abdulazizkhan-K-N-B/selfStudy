package dev.aknb.securityjpa.controller;

import dev.aknb.securityjpa.model.Post;
import dev.aknb.securityjpa.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public Iterable<Post> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") Post post) {
        return post;
    }
}
