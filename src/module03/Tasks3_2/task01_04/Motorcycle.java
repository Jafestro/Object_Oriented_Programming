package module03.Tasks3_2.task01_04;

public class Motorcycle extends AbstractVehicle{
    String color;

    public Motorcycle(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping");
    }

    @Override
    public void makeSound() {
        System.out.println("Motorcycle is making sound Broom Broom");
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\nColor: " + color + "\n";
    }
}
