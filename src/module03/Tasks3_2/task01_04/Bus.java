package module03.Tasks3_2.task01_04;

public class Bus implements Vehicle{
    String type, fuel;
    int capacity;

    public Bus(String type, String fuel, int capacity) {
        this.type = type;
        this.fuel = fuel;
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
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers\n";
    }
}
