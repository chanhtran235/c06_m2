package ss4_class_object;

public class Student {
    private int id; // biến toàn cục (global) , instance (bến thuộc về đối tượng) // có giá trị mặc định
    private String name;

    // khi không khai báo bất kỳ 1 constructor nào thì java sẽ tự tạo 1 constructor mặc định không tham số
    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this(id);
        this.name = name;
    }

    public void study(String subject) {
        System.out.println(this.name + " đang học môn " + subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
