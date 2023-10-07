package net.asyncdev;

import java.util.Scanner;
import net.asyncdev.Enums.Gender;

public class User implements IUser {

    private String name;
    private int age;
    private Gender gender;

    public User() {
    }

    public User(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    /**
     * Creates a new User object based on user input.
     *
     * @param scanner the Scanner object used to get user input
     * @return the newly created User object
     */
    public static User newUser(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Absorber la fin de la ligne

        System.out.print("Choose gender: ");
        System.out.print("\n1. " + Gender.MALE + "\n2. " + Gender.FEMALE + "\n[1]: ");
        int genderId = scanner.nextInt();
        scanner.nextLine(); // Absorber la fin de la ligne

        Gender gender = genderId == 2 ? Gender.FEMALE : Gender.MALE;

        return new User(name, age, gender);
    }
}
