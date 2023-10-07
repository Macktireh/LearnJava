package net.asyncdev;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;

import net.asyncdev.Enums.Gender;

public class UserTest
{

    public static User user()
    {
        return new User("Tom", 18, Gender.FEMALE);
    }
    
    @Test
    public void userValid()
    {
        User user = user();

        assertEquals("Tom", user.getName());
        assertEquals(18, user.getAge());
        assertEquals(Gender.FEMALE, user.getGender());
    }

    @Test
    public void userInvalid()
    {
        User user = user();

        assertNotEquals("John", user.getName());
        assertNotEquals(20, user.getAge());
        assertNotEquals(Gender.MALE, user.getGender());

    }

    @Test
    public void testNewUser() {
        // Test case 1: Test with valid inputs
        String input1 = "John\n25\n1\n";
        InputStream in1 = new ByteArrayInputStream(input1.getBytes());
        Scanner scanner1 = new Scanner(in1);
        User user1 = User.newUser(scanner1);
        assertEquals("John", user1.getName());
        assertEquals(25, user1.getAge());
        assertEquals(Gender.MALE, user1.getGender());

        // Test case 2: Test with valid inputs - female gender
        String input2 = "Alice\n30\n2\n";
        InputStream in2 = new ByteArrayInputStream(input2.getBytes());
        Scanner scanner2 = new Scanner(in2);
        User user2 = User.newUser(scanner2);
        assertEquals("Alice", user2.getName());
        assertEquals(30, user2.getAge());
        assertEquals(Gender.FEMALE, user2.getGender());

        // Test case 3: Test with invalid gender id
        String input3 = "David\n40\n3\n";
        InputStream in3 = new ByteArrayInputStream(input3.getBytes());
        Scanner scanner3 = new Scanner(in3);
        User user3 = User.newUser(scanner3);
        assertEquals("David", user3.getName());
        assertEquals(40, user3.getAge());
        assertEquals(Gender.MALE, user3.getGender());
    }
}
