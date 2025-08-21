package ss8.student_management.repository;


import ss8.student_management.entity.Student;
import ss8.student_management.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRepository  implements IStudentRepository{
    private final String STUDENT_FILE = "src/ss8/student_management/data/student.csv";
    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(STUDENT_FILE);
            String[] array = null;
            for (String line: stringList) {
                array = line.split(",");
                Student student = new Student(Integer.parseInt(array[0]),array[1],Float.parseFloat(array[2]));
                studentList.add(student);
            }
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
        return studentList;
    }

    @Override
    public boolean add(Student student) {
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToCSV());
        try{
            ReadAndWriteFile.writeFileCSV(STUDENT_FILE,stringList,true);
        }catch (IOException e){
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;
    }
}
