package net.asyncdev;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Ouvrir un scanner unique
        User users = User.newUser(scanner);
        System.out.println(users.toString());
        scanner.close(); // Fermer le scanner à la fin du programme
    }
}

