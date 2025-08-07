package ss3_method;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.showMessage("hello");
        System.out.println(sum(10.5,20));
    }
     public void showMessage(String mes){
        System.out.println(mes);
        System.out.println("kết thúc chương trình");
    }
    public static int sum(int a, int b){
        return (int)(a+b);
    }
    public static int sum(double a, int b){
        return (int)(a+b);
    }
    public static int sum(int a, double b){
        return (int)(a+b);
    }





}
