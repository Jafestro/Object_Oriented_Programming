package module03.Tasks3_1.task02;

import module02.Tasks2_1.task04.Car;

public class Bus extends Car {

    private int numberOfPassengers;

    public Bus(String typeName) {
        super(typeName);
        numberOfPassengers = 0;
    }

    public Bus(int speed, float gasolineLevel, String typeName) {
        super(speed, gasolineLevel, typeName);
        numberOfPassengers = 0;
    }

    public void passengerEnter(){
        numberOfPassengers++;
    }
    public void passengerExit(){
        numberOfPassengers--;
    }
}