package org.example.endterm_course_api.service;

import org.example.endterm_course_api.exception.ResourceNotFoundException;
import org.example.endterm_course_api.model.User;
import org.example.endterm_course_api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAll() {
        return repo.findAll();
    }

    public User create(User user) {
        return repo.save(user);
    }

    public User update(int id, User user) {
        User existing = repo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User with id " + id + " not found"));

        existing.setUsername(user.getUsername());
        existing.setRole(user.getRole());
        return repo.save(existing);
    }


    public void delete(int id) {
        repo.deleteById(id);
    }
}
