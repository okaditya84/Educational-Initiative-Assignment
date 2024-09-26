package hub;

import devices.SmartDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartHomeHub {
    private List<Observer> observers = new ArrayList<>();
    private List<SmartDevice> devices = new ArrayList<>();

    // To store scheduled tasks and automated triggers
    private List<Map<String, String>> scheduledTasks = new ArrayList<>();
    private List<Map<String, String>> automatedTriggers = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
        observers.add(new SmartDeviceObserver(device));
    }

    public void turnOnDevice(int id) {
        SmartDevice device = getDeviceById(id);
        if (device != null) {
            device.turnOn();
            notifyAllObservers();
        }
    }

    public void turnOffDevice(int id) {
        SmartDevice device = getDeviceById(id);
        if (device != null) {
            device.turnOff();
            notifyAllObservers();
        }
    }

    private SmartDevice getDeviceById(int id) {
        for (SmartDevice device : devices) {
            if (device.id == id) {
                return device;
            }
        }
        System.out.println("Device with ID " + id + " not found.");
        return null;
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // New method to print the status of all devices
    public void reportDeviceStatus() {
        System.out.println("Device Status Report:");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }

    // Method to schedule a task
    public void scheduleTask(int id, String time, String command) {
        Map<String, String> task = new HashMap<>();
        task.put("device", String.valueOf(id));
        task.put("time", time);
        task.put("command", command);
        scheduledTasks.add(task);
        System.out.println("Task scheduled: " + task);
    }

    // Method to add an automated trigger
    public void addTrigger(String condition, String operator, int value, String action) {
        Map<String, String> trigger = new HashMap<>();
        trigger.put("condition", condition + " " + operator + " " + value);
        trigger.put("action", action);
        automatedTriggers.add(trigger);
        System.out.println("Trigger added: " + trigger);
    }

    // Method to print all scheduled tasks
    public void printScheduledTasks() {
        System.out.println("Scheduled Tasks:");
        for (Map<String, String> task : scheduledTasks) {
            System.out.println(task);
        }
    }

    // Method to print all automated triggers
    public void printAutomatedTriggers() {
        System.out.println("Automated Triggers:");
        for (Map<String, String> trigger : automatedTriggers) {
            System.out.println(trigger);
        }
    }
}
