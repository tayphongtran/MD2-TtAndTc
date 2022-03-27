package thamso.thamchieu;
import thamso.thamchieu.Student;
public class Person {
    public static void main(String[] args) {
        test_clebarBrithday();
    }
    static void clebarBirthday(Student p) {
        System.out.println(p.getAge() - 11);
        p.setAge(p.getAge() + 2);
        p.setName(p.getName() + " ec");
//        Student student1 = new Student();
//        student1.setName("chimcanhcut");
//        student1.setAge(19);
//        System.out.println(student1.getName() + " " + student1.getAge() + " tuoi co "  );

    }

    static void test_clebarBrithday() {
        Student j;
        j = new Student();
        j.setAge(20);
        j.setName(" noi chuoi duoc khong");
        j.setName("hieu chua");
        clebarBirthday(j);
        System.out.println(j.getName() + " =" + j.getAge());
    }



}

