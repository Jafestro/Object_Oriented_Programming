package module03.Tasks3_2.task01_04;

public class Motorcycle implements Vehicle{
    String type, fuel, color;

    public Motorcycle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
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
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\nColor: " + color + "\n";
    }
}
