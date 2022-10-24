package service;

import model.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.Optional;

public interface IUserService{


    User saveUser(User user);


    Optional<User> findByUsername(String userName);

    void makeAdmin(String userName);
}
