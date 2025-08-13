package ss8.student_management.controller;

import ss8.student_management.entity.Student;
import ss8.student_management.service.IStudentService;
import ss8.student_management.service.StudentService;
import ss8.student_management.view.StudentView;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private IStudentService studentService  = new StudentService();
    public  void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý sinh viên");
            System.out.println("-------Chức năng------" +
                    "\n 1. Danh sách sắp xếp theo tên và id" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Tìm kiếm" +
                    "\n 4. Sắp xếp theo điểm " +
                    "\n 5. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("----Đây là chức năng hiển thị----------");
                    ArrayList<Student> studentList = this.studentService.findAll();
                    StudentView.display(studentList);
                    break;
                case ADD:
                    System.out.println("----Đây là chức năng thêm mới----------");
                    Student student = StudentView.inputDataForStudent();
                    this.studentService.add(student);
                    System.out.println("- Thêm mới thành công");
                    break;
                case DELETE:
                    System.out.println("----Đây là chức năng xoá----------");
                    break;
                case SEARCH:
                    System.out.println("----Đây là chức năng tìm kiếm----------");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
