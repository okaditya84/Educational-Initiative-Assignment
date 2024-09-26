package factory;

import devices.DoorLock;
import devices.Light;
import devices.SmartDevice;
import devices.Thermostat;

public class SmartDeviceFactory {
    public static SmartDevice createDevice(String type, int id) {
        switch (type) {
            case "light":
                return new Light(id);
            case "thermostat":
                return new Thermostat(id, 25);
            case "door":
                return new DoorLock(id);
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}
