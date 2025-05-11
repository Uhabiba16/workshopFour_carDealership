package com.ps;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Vehicle> inventory;

    private String name;
    private String address;
    private String phone;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> vehiclesByPrice(double min, double max) {
        ArrayList<Vehicle> vehiclesByPrice = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (min <= vehicle.getPrice() && max >= vehicle.getPrice()) {
                vehiclesByPrice.add(vehicle);
                System.out.println("your filtered result:\n");
            }
        }
        return vehiclesByPrice;
    }// Done

    public ArrayList<Vehicle> vehiclesByMakeModel(String make, String model) {
        ArrayList<Vehicle> vehiclesByMakeModel = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                vehiclesByMakeModel.add(vehicle);
            }
        }
        return vehiclesByMakeModel;
    }//Done

    public ArrayList<Vehicle> vehiclesByYear(int min, int max) {
        ArrayList<Vehicle> vehiclesByYear = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (min <= vehicle.getYear() && max >= vehicle.getYear()) {
                vehiclesByYear.add(vehicle);

            }
        }
        return vehiclesByYear;
    }//Done

    public ArrayList<Vehicle> vehiclesByColor(String color) {
        ArrayList<Vehicle> vehiclesByColor = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color) ) {
                vehiclesByColor.add(vehicle);
            }
        }
        return vehiclesByColor;
    }//Done

    public ArrayList<Vehicle> vehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> vehiclesByMileage = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (min <= vehicle.getOdometer() && max >= vehicle.getOdometer()) {
                vehiclesByMileage.add(vehicle);
            }
        }
        return vehiclesByMileage;
    }//Done

    public ArrayList<Vehicle> vehiclesByType(String type) {
        ArrayList<Vehicle> vehiclesByType = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getType().equalsIgnoreCase(type) ) {
                vehiclesByType.add(vehicle);
            }
        }
        return vehiclesByType;
    }//Done

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }//Done

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }

}

