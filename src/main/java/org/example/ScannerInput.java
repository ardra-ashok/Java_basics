package org.example;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.print("Enter your ID (int): ");
        int id = scanner.nextInt();

        System.out.print("Enter your salary (double): ");
        double salary = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left-over

        System.out.print("Enter your department (String): ");
        String dept = scanner.nextLine();

        System.out.println("ID: " + id + ", Salary: " + salary + ", Dept: " + dept);

        System.out.print("Enter two words: ");
        String first = scanner.next();
        String second = scanner.next();
        System.out.println("First: " + first + ", Second: " + second);

        String input;

        do {
            System.out.print("Type 'exit' to quit: ");
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("Exited the loop.");
        scanner.close();


    }
}
