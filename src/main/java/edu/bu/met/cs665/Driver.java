// /**
//  * Name: Xiao Xiao
//  * Course: CS-665 Software Designs & Patterns
//  * Date: 2/21/2023
//  * File Name: Driver.java
//  * Description: get driver basic information 
//  */

package edu.bu.met.cs665;

public class Driver implements Observer {
    private String driverName;
    private String vehicleType;
    private String currentLocation;

    public Driver(String driverName, String vehicleType) {
        this.driverName = driverName;
        this.vehicleType = vehicleType;
    }

    public void update(DeliveryRequest deliveryRequest) {
        if (deliveryRequest.getDeliveryStatus().equals("pending")) {
            System.out.println(driverName + ": Notification received for a new delivery request.");
        }
    }

    public String getDriverName() {
        return driverName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
}
