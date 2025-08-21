package ss12;

import ss8.student_management.entity.Student;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // lưu số lần vắng nghỉ học viên <Student, Interger>
        Map<Student,Integer> studentMap = new TreeMap<>();
        studentMap.put(new Student(1,"Nghiêm"),1);
        studentMap.put(new Student(1,"Nghiêm"),10);
        studentMap.put(new Student(12,"Huy"),3);
        studentMap.put(new Student(3,"An"),13);
        studentMap.put(new Student(7,"Thành"),34);


        // duyệt map có nhiều cách duyêt map
        Set<Student> studentSet = studentMap.keySet();
        for (Student student: studentSet) {
            System.out.println(student.getId() +": " + student.getName() + "-"+studentMap.get(student));
        }

        // cách duyệt theo entry
//        Set<Map.Entry<Student,Integer>> entries = studentMap.entrySet();
//        for(Map.Entry<Student,Integer> entry: entries){
//            System.out.println(entry.getKey().getId() +":"+entry.getKey().getName() + "-" + entry.getValue());
//        }
    }
}
