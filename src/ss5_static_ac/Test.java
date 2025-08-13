package ss5_static_ac;

public class Test {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
//        Person person = new Student(); // ép kiểu ngầm định
//        System.out.println(person instanceof Person); // true
//        System.out.println(person instanceof Student); // true
//
//
//        person.howToGo();// goi method lớp cha// complier
//        ((Student)person).study();
//        Student student = (Student)person;
//        student.study();
//
//
//        System.out.println(person);
//
//        Person[] people = new Person[100];
//        people[0] = new Student();
//        people[1] = new Teacher();
//
//        for (Person p: people) {
//            if (p!=null){
////                p.howToGo();
////                if (p instanceof Student){
////                    ((Student)p).study();
////                }else if (p instanceof Teacher){
////                    ((Teacher)p).getBonus();
////                }
//                ((Student)p).study();
//            }else {
//                break;
//            }
//
//        }

//        Person p = new Person();
//        ((Student)p).study();
//        Teacher teacher = new Teacher();
//        ((Student)teacher).study();

        Student student = new Student(1,"chánh");
        Student student1 = new Student(1,"chánh");
        System.out.println(student1==student);// false
        System.out.println(student1.equals(student));// true;

    }

}
