package dev.aknb.securityjpa;

import dev.aknb.securityjpa.model.Post;
import dev.aknb.securityjpa.model.User;
import dev.aknb.securityjpa.repository.PostRepository;
import dev.aknb.securityjpa.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SecurityJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(PostRepository postRepository, UserRepository userRepository, BCryptPasswordEncoder encoder) {
        return args -> {
            userRepository.save(new User("user", encoder.encode("password"), "ROLE_USER"));
            userRepository.save(new User("admin", encoder.encode("password"), "ROLE_USER,ROLE_ADMIN"));
            postRepository.save(new Post("Post 1", "post slug", "String content", "me"));
            postRepository.save(new Post("Post 2", "post slug", "String content", "me"));
        };
    }
}
