package ss3_method;


import java.util.Arrays;

public class DemoThamTriVaThamChieu {
    public static void main(String[] args) {
        int[] arr = {1,2};
        changeArray(arr);
        System.out.println("bên ngoài "+ Arrays.toString(arr));
    }

    public static void change1(int x){
        x++;
        System.out.println("trong hàm " + x);
    }
    public static void changeArray(int[] array){
        array = new int[]{100,200};
        System.out.println("trong hàm " + Arrays.toString(array));
    }
}
