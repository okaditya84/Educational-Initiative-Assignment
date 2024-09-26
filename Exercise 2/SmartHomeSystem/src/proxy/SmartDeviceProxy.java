package proxy;

import devices.SmartDevice;

public class SmartDeviceProxy {
    private SmartDevice device;

    public SmartDeviceProxy(SmartDevice device) {
        this.device = device;
    }

    public void secureTurnOn() {
        if (isAuthorized()) {
            device.turnOn();
        } else {
            System.out.println("Access denied to turn on device " + device.id);
        }
    }

    public void secureTurnOff() {
        if (isAuthorized()) {
            device.turnOff();
        } else {
            System.out.println("Access denied to turn off device " + device.id);
        }
    }

    private boolean isAuthorized() {
        return Math.random() > 0.1;  // Dummy authorization, 90% chance of access
    }
}
