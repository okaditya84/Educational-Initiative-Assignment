package devices;
public class DoorLock extends SmartDevice {
    public DoorLock(int id) {
        super(id);
        this.status = "locked"; // Default status for a door
    }

    @Override
    public void turnOn() {
        status = "locked";
    }

    @Override
    public void turnOff() {
        status = "unlocked";
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + status;
    }
}