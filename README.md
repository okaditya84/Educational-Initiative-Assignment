# Educational Initiative Placement Drive Assignment

This repository contains the assignment for the Educational Initiative Placement Drive. The assignment is divided into two main exercises, focusing on design patterns and smart home automation.

## File Structure

```
.
├── Design Patterns - Ex 1
│   ├── Behavioural Design Pattern
│   │   ├── ObserverPatternMarvel.java
│   │   └── StrategyPatternMarvel.java
│   ├── Creational Design Patterns
│   │   ├── FactoryPatternMarvel.java
│   │   └── SingletonPatternMarvel.java
│   └── Structural Design Pattern
│       ├── AdapterPatternMarvel.java
│       └── CompositePatternMarvel.java
├── Exercise 2
│   └── SmartHomeSystem/src
│       ├── devices
│       │   ├── DoorLock.java
│       │   ├── Light.java
│       │   ├── SmartDevice.java
│       │   └── Thermostat.java
│       ├── factory
│       │   └── SmartDeviceFactory.java
│       ├── hub
│       │   └── SmartHomeHub.java
│       ├── main
│       │   └── SmartHomeSimulation.java
│       └── proxy
│           └── SmartDeviceProxy.java
├── README.md
└── .gitignore
```

## Exercise 1: Design Patterns with Marvel Theme

In this exercise, we explore various design patterns using Marvel-themed examples. The patterns are categorized into three main types:

### 1. Behavioural Design Patterns
- **Observer Pattern** (`ObserverPatternMarvel.java`)
- **Strategy Pattern** (`StrategyPatternMarvel.java`)

### 2. Creational Design Patterns
- **Factory Pattern** (`FactoryPatternMarvel.java`)
- **Singleton Pattern** (`SingletonPatternMarvel.java`)

### 3. Structural Design Patterns
- **Adapter Pattern** (`AdapterPatternMarvel.java`)
- **Composite Pattern** (`CompositePatternMarvel.java`)

## Exercise 2: Smart Home Automation

This exercise demonstrates the application of design patterns in a real-world scenario: smart home automation. The system is structured as follows:

- **Devices** (`devices` package):
  - `DoorLock.java`
  - `Light.java`
  - `SmartDevice.java` (likely an interface or abstract class)
  - `Thermostat.java`

- **Factory** (`factory` package):
  - `SmartDeviceFactory.java`: Implements the Factory pattern for creating smart devices.

- **Hub** (`hub` package):
  - `SmartHomeHub.java`: Central control unit for the smart home system.

- **Main** (`main` package):
  - `SmartHomeSimulation.java`: Entry point for running the smart home simulation.

- **Proxy** (`proxy` package):
  - `SmartDeviceProxy.java`: Implements the Proxy pattern for smart devices.

This structure showcases the use of multiple design patterns in a practical application, including Factory, Proxy, and potentially others like Observer or Command patterns.

## Getting Started

You have the JDK 8+ installed on your system

## Technologies Used

- Java


