package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    void testLogoutNonAdminUsers() {
        User adminUser = new User("admin", "admin", true);
        User regularUser1 = new User("user1", "pass1", false);
        User regularUser2 = new User("user2", "pass2", false);

        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        assertTrue(userRepository.findByName("admin"));
        assertTrue(userRepository.findByName("user1"));
        assertTrue(userRepository.findByName("user2"));

        userRepository.logoutNonAdminUsers();

        assertTrue(userRepository.findByName("admin"));
        assertFalse(userRepository.findByName("user1"));
        assertFalse(userRepository.findByName("user2"));

    }
}
