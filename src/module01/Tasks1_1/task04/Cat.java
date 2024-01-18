package module01.Tasks1_1.task04;

public class Cat {
    //Fields, attributes
    private final String name;

    //Constructor
    public Cat(String name){
        this.name = name;
    }

    //Methods
    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        //Create an instance of the Cat class with a name
        Cat cat01 = new Cat("Whiskers");
        Cat cat02 = new Cat("Rex");

        //Call the meow method on the cat instance
        cat01.meow(); //Whiskers
        cat01.meow(); //Whiskers
        cat02.meow(); //Rex
        cat01.meow(); //Whiskers
    }
}
