package ss10.list;

import ss5_static_ac.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Student> list = new ArrayList();
//
//        list.add(1);
//        list.add("string");

        list.add(new Student());
        list.get(2).setName("chánh");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
            List<Integer> list1 = new ArrayList<>();
            list1.add(10); // cơ chế chế auto boxing

        }

        Box<Student> studentBox = new Box<>();
        studentBox.method1(new Student());


    }
}
