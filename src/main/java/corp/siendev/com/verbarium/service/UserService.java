/*
 * Copyright (c) 2022. SienDev, Inc. and Golubnichenko Iurii.  All Rights Reserved.
 */

package corp.siendev.com.verbarium.service;

import corp.siendev.com.verbarium.domain.User;
import corp.siendev.com.verbarium.exception.ResourceNotFoundException;
import corp.siendev.com.verbarium.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void removeUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public User getUserByName(String userName) {
        Optional<User> User = userRepository.findUserByName(userName);
        return User.orElseThrow(() -> new ResourceNotFoundException("Could not find user with name: " + userName));
    }

    public User getUserById(Long userId) {
        Optional<User> User = userRepository.findById(userId);
        return User.orElseThrow(() -> new ResourceNotFoundException("Could not find user with id: " + userId));
    }
}
