package ss8.student_management.service;


import ss8.student_management.entity.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentService extends IService<Student> {
 List<Student> searchByName(String name);

}
