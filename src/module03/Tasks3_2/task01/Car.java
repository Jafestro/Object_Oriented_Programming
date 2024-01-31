package module03.Tasks3_2.task01;

public class Car implements Vehicle {
    String type, fuel, color;
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public String getInfo() {
        return "Type: Car\n Fuel: " + fuel + "\n Color: " + color + "\n";
    }
}
