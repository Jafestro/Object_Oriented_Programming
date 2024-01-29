package module02.Tasks2_1.task03;

public class App {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.selectCoffeeType();
        coffeeMaker.selectCoffeeAmount();
        coffeeMaker.clickOnOff();
        coffeeMaker.selectCoffeeType();
        coffeeMaker.selectCoffeeAmount();
        coffeeMaker.clickOnOff();
        System.out.println(coffeeMaker.getType());
        System.out.println(coffeeMaker.getCoffeeAmount());
    }
}
