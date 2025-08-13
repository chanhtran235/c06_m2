package ss8.student_management.service;

import ss8.student_management.entity.Student;
import ss8.student_management.repository.IStudentRepository;
import ss8.student_management.repository.StudentRepository;


import java.util.ArrayList;

public class StudentService implements IStudentService{
    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public ArrayList<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public boolean add(Student student) {
        // cần kiểm trả id có trùng lặp hay không trước khi thêm mới thì kiểm tra ở đây
        //=> xử lý nghiệp vụ
        return studentRepository.add(student);
    }
}
