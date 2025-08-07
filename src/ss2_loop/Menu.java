package ss2_loop;

import java.util.Scanner;

public class Menu {
    public static void displayMainMenu(){
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
                    break;
                case ADD:
                    System.out.println("----Đây là chức năng thêm mới----------");
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
