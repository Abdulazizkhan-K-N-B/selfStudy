package dev.aknb.oauth2jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import dev.aknb.oauth2jwt.config.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class Oauth2JwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2JwtApplication.class, args);
    }

}
