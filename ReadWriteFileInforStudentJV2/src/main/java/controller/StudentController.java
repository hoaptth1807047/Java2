package controller;

import entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> list = new ArrayList<>();

    public void add() {
        System.out.println("Your rollNumber: ");
        String rollNumber = scanner.nextLine();
        System.out.println("Your name: ");
        String name = scanner.nextLine();
        Student student = new Student(rollNumber, name);
        list.add(student);
    }

    public void writeFile() throws Exception {
        FileWriter fileWriter = new FileWriter("src/main/resources/student.txt");
        for (Student student : list) {
            fileWriter.write("RollNumber: " + student.getRollNumber() + "      " + "Name: " + student.getName() + "\n");
        }
        fileWriter.close();
    }

    public void readFile() throws Exception {
        FileReader fileReader = new FileReader("src/main/resources/student.txt");
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
