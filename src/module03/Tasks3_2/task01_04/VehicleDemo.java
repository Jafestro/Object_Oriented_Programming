package module03.Tasks3_2.task01_04;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Car", "Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        Bus bus = new Bus("Bus", "Diesel", 40);

        System.out.println("Vehicle Demonstration");
        System.out.println();
        car.start();
        car.stop();
        System.out.println(car.getInfo());
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}
