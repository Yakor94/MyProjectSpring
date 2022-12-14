package service;

import dao.UserRepository;
import model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User updateUser (User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public void deleteUser(int id) {
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    public void deleteUser (long id) {
        userRepository.delete(getUserById(id));
    }

    public User getUserById (long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}