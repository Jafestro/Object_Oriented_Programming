package module03.Tasks3_2.task01;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();

        System.out.println("Vehicle Demonstration");
        car.start();
        car.stop();
        motorcycle.start();
        motorcycle.stop();
        bus.start();
        bus.stop();
    }
}
