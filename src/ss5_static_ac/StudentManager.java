package ss5_static_ac;

import java.util.Arrays;
import java.util.Comparator;

public class StudentManager {
    // class chức năng quan lý đối tượng student = >CRUD
    private static Student[] studentList = new Student[5];
    static {
        Student student1 = new Student(5,"haitt",10.0f);
        Student student2 = new Student(2,"chanhtv",3.5f);
        Student student3 = new Student(4,"thanh",6.5f);
        Student student4 = new Student(1,"thanh",8.0f);
        Student student5 = new Student(3,"nghiem",7.5f);
        studentList[0] = student1;
        studentList[1] = student2;
        studentList[2] = student3;
        studentList[3] = student4;
        studentList[4] = student5;
    }

    // phương hiển htij
    public Student[] getAll(){
        // xu ly gia tri null

        int count= 0;
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]!=null){
               count ++;
            }else {
                break;
            }
        }

        Student[] students = new Student[count];
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]!=null){
                students[i] = studentList[i];
            }else {
                break;
            }
        }
//        Arrays.sort(students);
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore()>o2.getScore()){
                    return 1;
                }else if (o1.getScore()<o2.getScore()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        return students;
    }
    public void add (Student student){
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]==null){
               studentList[i] = student;
               break;
            }
        }
    }

}
