package controller;

import entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsController {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> list = new ArrayList<>();


    public void add(){
        System.out.println("EnrolID: ");
        String enrolId = scanner.nextLine();
        System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        Student student = new Student(enrolId, firstName, lastName, age);
        list.add(student);
    }

    public void save() throws Exception{
            FileWriter fileWriter = new FileWriter("src/main/resources/student.dat.txt");
            fileWriter.write("   EnrolID   |        Full Name       Age" + "\n");
            fileWriter.write(" ------------|---------------------- -----" + "\n");
            for (Student student:
                    list) {
                fileWriter.write("   " + student.getEnrolID() + "   " + "|" + "   " + (student.getFirstName()) + " " + (student.getLastName()) + "      " + student.getAge() +  "\n");
            }
            System.out.println("Saved!");
            fileWriter.close();
    }

    public void display() throws Exception{
        FileReader fileReader = new FileReader("src/main/resources/student.dat.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }

    }
}
