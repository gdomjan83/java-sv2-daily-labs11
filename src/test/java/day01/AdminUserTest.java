package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {
    @Test
    void testAdminUserCreate() {
        User adminUser = new AdminUser("admin_main@hotmail.com", "adminpass");
        assertEquals("admin_main@hotmail.com", adminUser.getUserEmail());
        assertEquals("*********", adminUser.getPassword());
        assertNotEquals("******", adminUser.getPassword());
    }
}