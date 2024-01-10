package dev.yoda.cinemamanager.user.service;

import dev.yoda.cinemamanager.user.model.User;
import dev.yoda.cinemamanager.user.model.UserType;
import dev.yoda.cinemamanager.user.repository.UserRepository;
import dev.yoda.cinemamanager.user.validation.RegisterRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(long id) { return userRepository.findById(id); }

    public User getUserByEmail(String email) { return userRepository.findByEmail(email); }

    @Transactional(rollbackFor = Exception.class)
    public boolean createUser(RegisterRequest requestData, UserType type) {
        try {
            User user = new User(requestData.getEmail(), requestData.getPassword(), type);
            userRepository.save(user);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
