package ss8.student_management.view;

import ss8.student_management.controller.StudentController;
import ss8.student_management.controller.TeacherController;

import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        displayMain();
    }
    public static   void displayMain(){
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);
        final int STUDENT = 1;
        final int TEACHER = 2;
        boolean flag = true;
        while (flag) {
            System.out.println("Chọn đối tượng quản lý");
            System.out.println("-------Chức năng------" +
                    "\n 1. Quản lý sinh viên" +
                    "\n 2. Quản lý giáo viên" +
                    "\n 3. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case STUDENT:
                    System.out.println("----Đây là chức năng quản lý sinh viên----------");
                    studentController.displayMenu();
                    break;
                case TEACHER:
                    System.out.println("----Đây là chức năng quản lý giáo viên----------");
                    teacherController.displayMenu();
                    break;
                default:
                    flag = false;
            }
        }
    }
}
