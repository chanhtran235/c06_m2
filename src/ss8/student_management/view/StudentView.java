package ss8.student_management.view;

import ss8.student_management.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(ArrayList<Student> studentList){
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
    public static Student inputDataForStudent(){

        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        Student student = new Student(id,name);
        return student;
    }
}
