package module03.Tasks3_2.task01_04;

public class ElectricMotorcycle extends AbstractVehicle {
    String color;
    public ElectricMotorcycle(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("ElectricMotorcycle is making sound Breeep Breeep Brooooom");
    }

    @Override
    public void charge() {
        System.out.println("ElectricMotorcycle is charging");
    }

    @Override
    public void start() {
        System.out.println("ElectricMotorcycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("ElectricMotorcycle is stopping");
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\nColor: " + color + "\n";
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.printf("Fuel efficiency of a motorcycle is %s km/kWh\n", fuelEfficiency);
    }
}
