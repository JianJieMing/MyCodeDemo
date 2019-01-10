import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student = new Student();
        student.setName("张三");
        student.setAge(1);
        student.setGenter("男");

        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(11);
        student1.setGenter("女");

        Student student2 = new Student();
        student2.setName("张三");
        student2.setAge(13);
        student2.setGenter("男");

        Student student3 = new Student();
        student3.setName("张三");
        student3.setAge(1);
        student3.setGenter("男");

        Student student4 = new Student();
        student4.setName("张三");
        student4.setAge(1);
        student4.setGenter("男");

        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        long count = students.stream().
                filter((stu -> stu.getName().equals("张三"))).count();
        System.out.println("姓名叫张三的学生有: " + count + "个!");

    }
}
