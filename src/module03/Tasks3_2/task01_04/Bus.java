package module03.Tasks3_2.task01_04;

public class Bus extends AbstractVehicle{
    int capacity;

    public Bus(String type, String fuel, int capacity) {
        super(type, fuel);
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping");
    }

    @Override
    public void makeSound() {
        System.out.println("Bus is making sound Psh Psh");
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers\n";
    }

    @Override
    public void charge() {
        System.out.println("Can't charge a bus");
    }
}
