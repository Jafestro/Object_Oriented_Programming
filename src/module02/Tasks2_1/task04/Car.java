package module02.Tasks2_1.task04;

/* Define a class Car (convention capitalizes class names).
 * Car is public (as classes usually are, more on this later).
 */
public class Car {
    /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private int speed;
    private float gasolineLevel;
    private String typeName;
    private boolean cruiseControlOn;

    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }

    public Car(int speed, float gasolineLevel, String typeName) {
        this.speed = speed;
        this.gasolineLevel = gasolineLevel;
        this.typeName = typeName;
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    public void setCruiseControl(int minSpeed, int maxSpeed, int targetSpeed) {
        cruiseControlOn = true;
        System.out.println("Cruise control on");
        if (speed >= minSpeed && speed <= targetSpeed) {
            for (int i = 0; i <= ((targetSpeed - speed) / 10); i++) {
                accelerate();
                System.out.println(getTypeName() + ": speed is " + getSpeed() + " km/h");
            }
            decelerate(speed - targetSpeed);
        } else if (speed >= targetSpeed && speed <= maxSpeed) {
            int amount = speed - targetSpeed;
            for (int i = 0; i < amount; i++) {
                decelerate(1);
                System.out.println(getTypeName() + ": speed is " + getSpeed() + " km/h");
            }
        } else {
            System.out.println("Cruise control failed");
            turnOffCruiseControl();
        }
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
        System.out.println("Cruise control off");
    }

    public int readCurrentTargetSpeed() {
        return speed;
    }

   public int getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = 100;
    }

    public float getGasolineLevel() {
        return gasolineLevel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGasolineLevel(float gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }
}
