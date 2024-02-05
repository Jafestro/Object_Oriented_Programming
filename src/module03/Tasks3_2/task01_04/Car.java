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

    @Override
    public void calculateFuelEfficiency() {
        System.out.printf("Fuel efficiency of a car is %s km/l\n", fuelEfficiency);
    }

    @Override
    public void charge() {
        System.out.println("Can't charge a car");
    }
}
