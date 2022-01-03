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
}