package module03.Tasks3_2.task01;

public class Bus implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping");
    }

    @Override
    public String getInfo() {
        return "Type: Bus";
    }
}
