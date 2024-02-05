package module03.Tasks3_2.task01_04;

public class Car extends AbstractVehicle{
    String color;

    public Car(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void makeSound() {
        System.out.println("Car is making sound Vroom Vroom");
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\nColor: " + color + "\n";
    }
}
