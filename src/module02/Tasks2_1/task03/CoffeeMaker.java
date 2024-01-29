package module02.Tasks2_1.task03;

import java.util.Scanner;

public class CoffeeMaker {
    private CoffeeTypes type;
    private int coffeeAmount = 10;
    private boolean isOn = false;
    private final Scanner scanner = new Scanner(System.in);

    //Methods
    public void selectCoffeeType(){
        if (isOn) {
            System.out.println("1. Normal\n2. Espresso");
            switch (scanner.nextLine()) {
                case "1":
                    type = CoffeeTypes.NORMAL;
                    System.out.println(type);
                    break;
                case "2":
                    type = CoffeeTypes.ESPRESSO;
                    System.out.println(type);
                    break;
                default:
                    System.out.println("Wrong input");
                    selectCoffeeType();
            }
        }
        else
            System.out.println("...Machine is Off");
    }

    public void selectCoffeeAmount(){
        if (isOn) {
            System.out.println("Coffee amount (10-80ml):");
            System.out.println(coffeeAmount + "ml " +
                    "(enter + or - " +
                    "to change it, if you are done just" +
                    " enter blank space");
            switch (scanner.nextLine()) {
                case "+":
                    if (coffeeAmount >= 80) {
                        System.out.println("Max Amount reached");
                        selectCoffeeAmount();
                        break;
                    }
                    coffeeAmount++;
                    selectCoffeeAmount();
                    break;
                case "-":
                    if (coffeeAmount <= 10) {
                        System.out.println("Min Amount Reached");
                        selectCoffeeAmount();
                        break;
                    }
                    coffeeAmount--;
                    selectCoffeeAmount();
                    break;
                default:
            }
        }
        else
            System.out.println("...Machine is Off");
    }

    public void clickOnOff(){
        this.isOn = !isOn;
        if(isOn){
            System.out.println("Biip Biip Coffee Machineeee is On!");
        }
        else
            System.out.println("Machine is off");
    }

    // Getters

    public CoffeeTypes getType() {
        return type;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    public boolean isOn() {
        return isOn;
    }
}
