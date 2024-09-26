package devices;

public class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(int id, int temperature) {
        super(id);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        status = "on";
    }

    @Override
    public void turnOff() {
        status = "off";
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is " + status + " at " + temperature + " degrees";
    }
}