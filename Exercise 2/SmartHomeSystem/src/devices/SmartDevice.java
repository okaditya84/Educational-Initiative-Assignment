package devices;

public abstract class SmartDevice {
    public int id;
    protected String status;

    public SmartDevice(int id) {
        this.id = id;
        this.status = "off";
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract String getStatus();
}