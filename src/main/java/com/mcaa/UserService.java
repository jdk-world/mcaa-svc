package com.mcaa;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public List<User> getSampleUsers() {
        return Arrays.asList(
            new User(1L, "Saurabh", "password123", null),
            new User(2L, "jane_smith", "mypassword", null),
            new User(3L, "mike_jones", "securepass", null),
            new User(4L, "lisa_brown", "pass1234", null),
            new User(5L, "emily_davis", "password456", null)
        );
    }

    // Other user-related methods can be added here
}
