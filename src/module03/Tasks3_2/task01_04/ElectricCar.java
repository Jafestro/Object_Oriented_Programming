package module03.Tasks3_2.task01_04;

public class ElectricCar extends AbstractVehicle{
    String color;
    public ElectricCar(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("ElectricCar is making sound Beep Beep Vroom Breeep");
    }

    @Override
    public void charge() {
        System.out.println("ElectricCar is charging");
    }

    @Override
    public void start() {
        System.out.println("ElectricCar is starting");
    }

    @Override
    public void stop() {
        System.out.println("ElectricCar is stopping");
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\nColor: " + color + "\n";
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.printf("Fuel efficiency of a car is %s km/kWh\n", fuelEfficiency);
    }

}
