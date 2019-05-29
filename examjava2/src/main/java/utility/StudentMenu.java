package utility;

import controller.StudentsController;
import java.util.Scanner;

public class StudentMenu {
    public void generateMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        StudentsController studentsController = new StudentsController();
        while (true) {
            System.out.println("1. Add new student.");
            System.out.println("2. Save.");
            System.out.println("3. Display all students.");
            System.out.println("4. Exit.");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentsController.add();
                    break;
                case 2:
                    studentsController.save();
                    break;
                case 3:
                    studentsController.display();
                    break;
                case 4:
                    System.out.println("Exited!");
                    break;
                default:
                    System.out.println("Your choice is false. Please choice from 1 to 4.");
                    break;
            }
            if (choice == 4) {
                System.out.println("See you again!");
                break;
            }
        }
    }
}
