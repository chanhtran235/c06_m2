package ss2_loop;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String[] cars = {"Honda","Yamaha","Vinfast"};
        String cars1[] = {"Honda","Yamaha","Vinfast"};



//        System.out.println("thay đổi mảng for");
//        for (int i =0;i< cars.length ;i++){
//            cars[i] += "Hãng xe";
//        }
        System.out.println("sử dụng foreach");

        for(String car : cars){
            car +=" Hãng xe";
        }

        System.out.println(Arrays.toString(cars));
    }
}
