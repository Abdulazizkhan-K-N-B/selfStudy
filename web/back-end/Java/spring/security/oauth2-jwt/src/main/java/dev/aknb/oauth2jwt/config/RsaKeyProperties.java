package dev.aknb.oauth2jwt.config;

import java.security.interfaces.RSAPublicKey;
import java.security.interfaces.RSAPrivateKey;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rsa")
public record RsaKeyProperties(RSAPublicKey publicKey, RSAPrivateKey privateKey) {
}
