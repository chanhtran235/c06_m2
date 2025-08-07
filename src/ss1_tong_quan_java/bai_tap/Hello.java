package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Hello {

    static int i1; // biến toàn cục
    public static void main(String[] args) {
        // bắt đầu chạy chương trình
        System.out.println("Hello");
//        System.out.println("C06 không chịu tìm hiểu bài mới???");
//        short sh =10;
//        int i =10;
//        float f = 10;
//        int i1 =(int)10.1f;
//        float f1 =10.0f;
//        double d = 10.0;
//        char c ='a';
//        // đối tượng
//        String s = "Hello";
//        Integer n =10;
//        Character character ='1';
//        Float f2 =10.0f;
//        Double db =10.2;
//        Hello hello = new Hello();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.printf("tên của bạn vừa nhập là :" + name);
        System.out.printf("tuổi  của bạn vừa nhập là :" + age);
        System.out.printf("địa chỉ  của bạn vừa nhập là :" + address);

        final double PI = 3.1415;
        int number;
        number = 10;
        System.out.println(i1);


    }
}
