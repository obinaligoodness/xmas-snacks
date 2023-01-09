package tdd;

public class AirConditioner {
    private boolean isOn;
    private int temperature;
    private String productName;

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getOn() {
        return isOn;
    }

    public void setTemperature(int temperature) {
        if (temperature >= 16 && temperature <= 30)
            this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;}
    public void increaseTemperature() {
        if (temperature < 30)
            this.temperature = temperature + 1;
    }

    public void decreaseTemperature() {
        if (temperature > 16)
            this.temperature = temperature - 1;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getProductName() {
        return productName;
    }
    public AirConditioner(String name){
        this.productName=name;
    }

    }


