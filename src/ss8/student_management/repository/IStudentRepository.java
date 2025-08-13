package ss8.student_management.repository;


import ss8.student_management.entity.Student;

import java.util.ArrayList;

public interface IStudentRepository {
    ArrayList<Student> findAll();
    boolean add(Student student);
}
