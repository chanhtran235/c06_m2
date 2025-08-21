package ss8.student_management.view;

import ss8.student_management.entity.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(List<Student> studentList){
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
    public static Student inputDataForStudent(){

        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập điểm");
        float score = Float.parseFloat(scanner.nextLine());
        Student student = new Student(id,name,score);
        return student;
    }
}
