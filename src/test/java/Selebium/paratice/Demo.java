package Selebium.paratice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        Assert.assertEquals(sum, 15, "Sum should be 15");
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 5;
        int difference = a - b;
        Assert.assertEquals(difference, 5, "Difference should be 5");
    }

    // Failing test case
    @Test
    public void testMultiplication() {
        int a = 5;
        int b = 10;
        int product = a * b;
        // Intentionally failing the test by checking for an incorrect value
        Assert.assertEquals(product, 60, "Product should be 50");  // This will fail because 5 * 10 = 50
    }

    // Registration test case 1 - Valid credentials
    @Test
    public void testValidRegistration() {
        String username = "validUser";
        String password = "validPassword";
        boolean isRegistered = register(username, password);
        Assert.assertTrue(isRegistered, "Registration should succeed with valid credentials");
    }

    // Registration test case 2 - Missing password (Failing test case)
    @Test
    public void testRegistrationMissingPassword() {
        String username = "userWithoutPassword";
        String password = "";  // Missing password
        boolean isRegistered = register(username, password);
        // Intentionally checking for a wrong assertion (failing case)
        Assert.assertTrue(isRegistered, "Registration should fail due to missing password");
    }

    // Registration test case 3 - Invalid username format
    @Test
    public void testInvalidUsernameFormat() {
        String username = "invalid_user@name";
        String password = "validPassword";
        boolean isRegistered = register(username, password);
        Assert.assertFalse(isRegistered, "Registration should fail due to invalid username format");
    }

    // Mock registration method for demonstration purposes
    private boolean register(String username, String password) {
        // Mock registration logic
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }
        if (username.contains("@")) {
            return false;
        }
        return true;
    }
}
