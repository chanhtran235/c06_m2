package ss8.student_management.service;


import ss8.student_management.entity.Student;

import java.util.ArrayList;

public interface IStudentService {
    ArrayList<Student> findAll();
    boolean add(Student student);
}
