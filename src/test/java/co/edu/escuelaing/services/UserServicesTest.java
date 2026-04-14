package co.edu.escuelaing.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class UserServicesTest {

    @Test
    void postUserReturnsSameInstanceAndSetsStatusMessage() {
        User user = new User();
        user.setName("Alice");
        user.setEmail("alice@example.com");

        User result = UserServices.postUser(user);

        assertSame(user, result);
        assertEquals(
                "User Alice with email alice@example.com created successfully",
                result.getStatus()
        );
    }
}
