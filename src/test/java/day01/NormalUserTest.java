package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {
    @Test
    void testNormalUserCreate() {
        NormalUser normalUser = new NormalUser("gdomj@hotmail.com", "goodpassword");
        assertEquals("gdomj@hotmail.com", normalUser.getUserEmail());
        assertEquals("goodpassword", normalUser.getPassword());
    }

    @Test
    void testAdminUserCreate() {
        AdminUser adminUser = new AdminUser("admin_main@hotmail.com", "adminpass");
        assertEquals("admin_main@hotmail.com", adminUser.getUserEmail());
        assertEquals("*********", adminUser.getPassword());
        assertNotEquals("******", adminUser.getPassword());
    }
}