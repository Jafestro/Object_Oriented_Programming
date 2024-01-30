package module02.Tasks2_1.task04;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
        myCar.fillTank();
        myCar.setCruiseControl(0, 100, 30);
        myCar.setCruiseControl(60, 100, 80);
        myCar.setCruiseControl(0, 100, 80);
        System.out.println("Current target speed is " + myCar.readCurrentTargetSpeed() + " km/h");
    }
}
