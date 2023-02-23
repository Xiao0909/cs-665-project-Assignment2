package edu.bu.met.cs665;
/**
 * Name: Xiao Xiao
 * Course: CS-665 Software Designs & Patterns
 * Date: 2-21-2023
 * File Name: Person.java
 * Description: This class is responsible for the methods and attributes of a Delivery Request.
 */

public class DeliveryRequest {
    private String shopName;
    private String customerName;
    private String customerAddress;
    private String deliveryStatus;

    public DeliveryRequest(String shopName, String customerName, String customerAddress) {
        this.shopName = shopName;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.deliveryStatus = "pending";
    }

    public String getShopName() {
        return shopName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}