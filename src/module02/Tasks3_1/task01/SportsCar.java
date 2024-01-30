package module02.Tasks3_1.task01;

import module02.Tasks2_1.task04.Car;

public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    public SportsCar(int speed, float gasolineLevel, String typeName) {
        super(speed, gasolineLevel, typeName);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            setSpeed(getSpeed() + 20);
            setGasolineLevel(getGasolineLevel() - 5);
        }
        else
            setSpeed(0);
    }

    @Override
    public void decelerate(int amount) {
       super.decelerate(amount);
    }
}
