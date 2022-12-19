package com.aknb.signuplogin.user;

import java.util.Collections;
import java.util.Optional;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.aknb.signuplogin.verifToken.VerifTokenService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG = "User with email %s not found";

    private final UserRepository userRepository;
    private final VerifTokenService verifyTokenService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository,
            VerifTokenService verifyTokenService,
            BCryptPasswordEncoder bCryptPasswordEncoder) {

        this.userRepository = userRepository;
        this.verifyTokenService = verifyTokenService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email).orElseThrow(
                () -> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
    }

    @Transactional
    public String signUp(User user) {

        Optional<User> optionalUser = userRepository.findByEmail(user.getEmail());
        String token;
        if (optionalUser.isPresent()) {

            if (bCryptPasswordEncoder.matches(user.getPassword(), optionalUser.get().getPassword())
                    && !optionalUser.get().getEnabled()) {
                user.setUserRoles(optionalUser.get().getUserRoles());
                user.setPassword(optionalUser.get().getPassword());
                user.setId(optionalUser.get().getId());
                userRepository.save(user);
                token = verifyTokenService.createNewVerifToken(user);
                return token;
            } else {
                throw new IllegalStateException("Email already exist");
            }
        }

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setUserRoles(Collections.singleton(new UserRole("USER")));
        user = userRepository.save(user);
        token = verifyTokenService.createNewVerifToken(user);

        return token;
    }

    public void enableAppUser(User user) {
        user.setEnabled(true);
        userRepository.save(user);
    }

    public User getUserByEmail(String email) {
        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (optionalUser.isEmpty()) {
        
            log.error("User not found email: {}", email);
            throw new UsernameNotFoundException("User not found exception.");
        }
        return optionalUser.get();
    }
}
