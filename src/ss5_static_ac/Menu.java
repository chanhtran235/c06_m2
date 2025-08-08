package ss5_static_ac;

import java.util.Scanner;

public class Menu {
    private StudentManager studentManager = new StudentManager();
    public  void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý sinh viên");
            System.out.println("-------Chức năng------" +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("----Đây là chức năng hiển thị----------");
                    Student[] students = this.studentManager.getAll();
                    for (Student student: students) {
                        System.out.println(student);
                    }
                    break;
                case ADD:
                    System.out.println("----Đây là chức năng thêm mới----------");
                    System.out.println("nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập tên");
                    String name = scanner.nextLine();
                    Student student = new Student(id,name);
                    studentManager.add(student);
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
