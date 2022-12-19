package dev.aknb.securityjpa.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dev.aknb.securityjpa.model.SecurityUser;
import dev.aknb.securityjpa.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userRepository.findByUsername(username)
                .map(SecurityUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with -> " + username));
    }
}
