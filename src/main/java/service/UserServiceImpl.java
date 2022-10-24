package service;

import model.Role;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRol(Role.USER);
        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String userName){
        Optional<User> byUsername = userRepository.findByUsername(userName);
        return byUsername;
    }

    @Override
    public void makeAdmin(String userName){
        userRepository.updateUserRole(userName, Role.ADMIN);
    }

}
