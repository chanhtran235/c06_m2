package ss8.student_management.repository;


import ss8.student_management.entity.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    boolean add(Student student);
}
