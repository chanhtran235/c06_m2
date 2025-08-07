package ss4_class_object;

public class Run {
    public static void main(String[] args) {
//        Student student = new Student();
//        System.out.println(student.id);
//        System.out.println(student.name);
        Student student1 = new Student(1,"chánh");
        student1.study("Toán");
        System.out.println(student1);
    }
}
