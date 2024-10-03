package com.mcaa;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class UserService {

    public List<User> getSampleUsers() {
        return Arrays.asList(
            new User(1L, "Saurabh", "password123", "saurabh@example.com", "1234567890", "ABC Corp", "Admin", "/images/profile/default-pic.jpg", null),
            new User(2L, "jane_smith", "mypassword", "jane@example.com", "0987654321", "XYZ Ltd", "User", "https://example.com/profile/jane.jpg", null),
            new User(3L, "mike_jones", "securepass", "mike@example.com", "1122334455", "Tech Solutions", "User", "https://example.com/profile/mike.jpg", null),
            new User(4L, "lisa_brown", "pass1234", "lisa@example.com", "5566778899", "Innovate Inc.", "User", "https://example.com/profile/lisa.jpg", null),
            new User(5L, "emily_davis", "password456", "emily@example.com", "1231231234", "Creative Co.", "User", "https://example.com/profile/emily.jpg", null)
        );
    }
}
