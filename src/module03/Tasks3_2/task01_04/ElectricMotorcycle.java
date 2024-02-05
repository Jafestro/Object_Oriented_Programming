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
}
