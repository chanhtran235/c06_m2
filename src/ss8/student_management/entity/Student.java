package ss8.student_management.entity;

import java.util.Objects;

public class Student extends Person implements Comparable<Student> {
    public static String school = "BK";
    private float score;

    public Student() {
    }

    public Student(int id) {
        super(id);
    }

    @Override
    public String getInfoToCSV() {
        return this.getId()+","+this.getName()+","+this.score;
    }

    public Student(int id, String name, float score) {
        super(id, name);
        this.score = score;
    }

    public Student(int id, String name) {
        super(id, name);
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student :" + super.toString() + ", Score : " + score;
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return this.getId() == student.getId() && student.getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getId()) + this.getName().hashCode();
    }

    @Override
    public int compareTo(Student s) {
        return this.getId() - s.getId();
    }
}
