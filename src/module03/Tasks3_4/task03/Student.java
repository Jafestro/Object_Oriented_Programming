package module03.Tasks3_4.task03;

import java.io.Serializable;

public class Student implements Serializable{
    private final int id;
    private String name;
    private int age;
    private static int studentCount = 0;

    public Student(String name, int age) {
        studentCount++;
        this.id = studentCount;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
