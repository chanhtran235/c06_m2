package ss10.list;

public class Box <T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <K> void method1(K k){
        System.out.println(k);
    }
}
