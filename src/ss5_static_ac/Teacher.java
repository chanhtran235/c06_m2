package ss5_static_ac;

public class Teacher  extends Person{
    private int salary;

    public Teacher() {
    }


    public int getBonus(){
        System.out.println("thưởng tiền mỗi năm");
        return 1000;
    }

    @Override
    public void howToGo() {
        System.out.println("giáo viên đi bằng xe đạp");
    }
}
