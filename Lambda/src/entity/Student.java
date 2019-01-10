package entity;

public class Student {

    private String name;
    private int age;
    private String genter;

    public Student() {
    }

    public Student(String name, int age, String genter) {
        this.name = name;
        this.age = age;
        this.genter = genter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genter='" + genter + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenter() {
        return genter;
    }

    public void setGenter(String genter) {
        this.genter = genter;
    }
}
