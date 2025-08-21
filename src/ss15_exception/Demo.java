package ss15_exception;

import ss8.student_management.entity.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("----------begin----------");
        int[] array = {10,23,45,67};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập  index cần lấy ra");
        int index=-1;
        try{
            index = Integer.parseInt(scanner.nextLine());
            System.out.println(index);
            System.out.println(array[index]);

        }catch (NumberFormatException e){
            System.err.println("lỗi do nhập sai dữ liệu dạng chuỗi");
            index = 0;
            System.out.println(index);
            System.out.println(array[index]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("lỗi do nhập sai dữ liệu dạng chuỗi");
            index = array.length-1;
            System.out.println(index);
            System.out.println(array[index]);
        }catch (Exception e){
            System.out.println("lỗ gì đó chưa rõ");
            e.printStackTrace();
        }finally {
            System.out.println("đoạn code luôn chạy cho dù exception có hay không có");
            // đóng kết nối file hoặc database
        }

        readFile("fsfsf");

        System.out.println("----------finish----------------");
    }

    public static void readFile(String filePath) throws FileNotFoundException {
//        try {
            FileReader fileReader = new FileReader(filePath);
//        }catch (FileNotFoundException e){
//
//        }

    }

}
