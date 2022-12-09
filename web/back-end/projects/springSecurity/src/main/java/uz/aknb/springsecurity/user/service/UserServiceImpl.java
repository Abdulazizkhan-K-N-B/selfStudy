package uz.aknb.springsecurity.user.service;

import uz.aknb.springsecurity.role.Role;
import uz.aknb.springsecurity.role.RoleRepository;
import uz.aknb.springsecurity.user.User;
import uz.aknb.springsecurity.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User saveUser(User user) {
        log.info("Saving new user({}) to the database.", user.getName());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role({}) to the database.", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = getUserByUsername(username);


        Role role = roleRepository.findByName(roleName).orElseThrow(
                () -> new IllegalStateException("Role not found with this name.")
        );
        log.info("Adding role({}) to the user({}).", roleName, username);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("Fetching user({})", username);
        return getUserByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users.");
        return userRepository.findAll();
    }

    // |-> SECONDARY FUNCTIONS <-|

    public User getUserByUsername(String username) {

        Optional<User> optionalUser = userRepository.findByUsername(username);

        if (optionalUser.isEmpty()) {
            log.error("User not found: {}", username);
            throw new IllegalStateException("User not found!");
        } else {
            log.info("User found: {}", username);
        }

        return optionalUser.get();
    }
}