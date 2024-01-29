package module02.Tasks2_1.task01;

public class Television {
    private int channel;
    private boolean powerOn;

    public Television() {
        this.powerOn = false;
    }

    // Getters and Setters
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    //Methods
    public boolean isOn() {
        return powerOn;
    }

    public void pressOnOff(){
        /*if (powerOn)
            this.powerOn = false;
        else
            this.powerOn = true;
         *
         */
        this.powerOn = !powerOn;
    }
}
