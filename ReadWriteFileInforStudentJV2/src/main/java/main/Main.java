package main;

import controller.StudentController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        while (true) {
            System.out.println("1. Add Student.");
            System.out.println("2. Write File");
            System.out.println("3. Read File");
            System.out.println("4. Exit.");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentController.add();
                    break;
                case 2:
                    studentController.writeFile();
                    break;
                case 3:
                    studentController.readFile();
                    break;
                case 4:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Your choice is false. Please choice from 1 to 4.");
            }
            if (choice == 4) {
                System.out.println("See you again");
                break;
            }
        }
    }
}
