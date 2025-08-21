package ss8.student_management.repository;

import ss8.student_management.entity.Student;
import ss8.student_management.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public interface ITeacherRepository {
    List<Teacher> findAll();
    boolean add(Teacher teacher);
}
