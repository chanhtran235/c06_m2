package ss8.student_management.repository;


import ss8.student_management.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentRepository  implements IStudentRepository{
    private static ArrayList<Student> studentList = new ArrayList<>();
    static {
        Student student1 = new Student(5,"haitt",10.0f);
        Student student2 = new Student(2,"chanhtv",3.5f);
        Student student3 = new Student(4,"thanh",6.5f);
        Student student4 = new Student(1,"thanh",8.0f);
        Student student5 = new Student(3,"nghiem",7.5f);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
    }
    @Override
    public ArrayList<Student> findAll() {
        // kết nối database hoặc đọc ghi file để lấy dữ liệu
        // => thêm vào mảng student[]
        return studentList;
    }

    @Override
    public boolean add(Student student) {
        studentList.add(student);
        return true;
    }
}
