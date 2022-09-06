package com.aknb.signuplogin.verifToken;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.aknb.signuplogin.user.User;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class VerifTokenService {

    private final VerifTokenRepository verifTokenRepository;

    public String createNewVerifToken(User user){
        String token = UUID.randomUUID().toString();

        VerifToken verifToken = new VerifToken(
            token,
            LocalDateTime.now(),
            LocalDateTime.now().plusMinutes(15),
            user);
        verifTokenRepository.save(verifToken);
        log.info("Created new token: {}", token);

        return token;
    }

    public void setConfirmedAt(VerifToken verifToken){
        verifToken.setConfirmedAt(LocalDateTime.now());
        verifTokenRepository.save(verifToken);
    }

    public VerifToken getVerifTokenByToken(String token){
        return verifTokenRepository.findByToken(token).orElseThrow(
                () -> new IllegalStateException("Token not found!")
        );
    }
}
