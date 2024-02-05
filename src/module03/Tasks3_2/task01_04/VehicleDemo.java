package module03.Tasks3_2.task01_04;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Car", "Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        Bus bus = new Bus("Bus", "Diesel", 40);
        car.fuelEfficiency = 10;
        motorcycle.fuelEfficiency = 5;
        bus.fuelEfficiency = 20;

        System.out.println("Vehicle Demonstration");
        System.out.println();
        car.start();
        car.stop();
        car.charge();
        car.makeSound();
        car.calculateFuelEfficiency();
        System.out.println(car.getInfo());
        motorcycle.start();
        motorcycle.stop();
        motorcycle.charge();
        motorcycle.makeSound();
        motorcycle.calculateFuelEfficiency();
        System.out.println(motorcycle.getInfo());
        bus.start();
        bus.stop();
        bus.makeSound();
        bus.charge();
        bus.calculateFuelEfficiency();
        System.out.println(bus.getInfo());

        ElectricCar electricCar = new ElectricCar("ElectricCar", "Electricity", "Blue");
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("ElectricMotorcycle", "Electricity", "White");
        electricCar.fuelEfficiency = 1;
        electricMotorcycle.fuelEfficiency = 2;
        System.out.println("Electric Vehicle Demonstration");
        System.out.println();
        electricCar.start();
        electricCar.stop();
        electricCar.charge();
        electricCar.makeSound();
        electricCar.calculateFuelEfficiency();
        System.out.println(electricCar.getInfo());
        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.charge();
        electricMotorcycle.makeSound();
        electricMotorcycle.calculateFuelEfficiency();
        System.out.println(electricMotorcycle.getInfo());
    }
}
