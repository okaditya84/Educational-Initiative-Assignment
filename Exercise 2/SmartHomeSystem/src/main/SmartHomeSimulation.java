package main;

import factory.SmartDeviceFactory;
import hub.SmartHomeHub;

import java.util.Scanner;

public class SmartHomeSimulation {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        // Initialize devices
        hub.addDevice(SmartDeviceFactory.createDevice("light", 1));
        hub.addDevice(SmartDeviceFactory.createDevice("thermostat", 2));
        hub.addDevice(SmartDeviceFactory.createDevice("door", 3));

        // User interaction
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nSmart Home Menu:");
            System.out.println("1. Turn On Device");
            System.out.println("2. Turn Off Device");
            System.out.println("3. Schedule Task");
            System.out.println("4. Add Trigger");
            System.out.println("5. Show Device Status");
            System.out.println("6. Show Scheduled Tasks");
            System.out.println("7. Show Automated Triggers");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter device ID to turn on: ");
                    int deviceIdOn = scanner.nextInt();
                    hub.turnOnDevice(deviceIdOn);
                    break;
                case 2:
                    System.out.print("Enter device ID to turn off: ");
                    int deviceIdOff = scanner.nextInt();
                    hub.turnOffDevice(deviceIdOff);
                    break;
                case 3:
                    System.out.print("Enter device ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter time (HH:mm): ");
                    String time = scanner.next();
                    System.out.print("Enter command (Turn On/Off): ");
                    String command = scanner.next();
                    hub.scheduleTask(id, time, command);
                    break;
                case 4:
                    System.out.print("Enter trigger condition (e.g., temperature): ");
                    String condition = scanner.next();
                    System.out.print("Enter operator (e.g., >): ");
                    String operator = scanner.next();
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    System.out.print("Enter action (e.g., turnOff(1)): ");
                    String action = scanner.next();
                    hub.addTrigger(condition, operator, value, action);
                    break;
                case 5:
                    hub.reportDeviceStatus();
                    break;
                case 6:
                    hub.printScheduledTasks();
                    break;
                case 7:
                    hub.printAutomatedTriggers();
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}

