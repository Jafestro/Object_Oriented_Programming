package module03.Tasks3_2.task01_04;

public abstract class AbstractVehicle implements Vehicle {
    protected String type, fuel;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    @Override
    public void start() {
        System.out.println("Vehicle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle is stopping");

    }

    public abstract void makeSound();

    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\n";
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
