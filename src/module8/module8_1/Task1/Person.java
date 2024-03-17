package module8.module8_1.Task1;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String john, int i, String newYork) {
        this.name = john;
        this.age = i;
        this.city = newYork;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
