// /**
//  * Name: Xiao Xiao
//  * Course: CS-665 Software Designs & Patterns
//  * Date: 2/21/2023
//  * File Name: shop.java
//  * This class is responsible for the shop information and create the deliverRequest.
//  */

package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;


public class Shop implements Subject {
    private List<Observer> observers;
    private String shopName;

    public Shop(String shopName) {
        this.shopName = shopName;
        observers = new ArrayList<>();
    }

    public void createDeliveryRequest(String customerName, String customerAddress) {
        DeliveryRequest deliveryRequest = new DeliveryRequest(shopName, customerName, customerAddress);
        notifyObservers(deliveryRequest);
    }

    /**
     * Remove an observer.
     *
     * @param driver1 an observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     *
     *
     * Notify observers to all
     */
    @Override
    public void notifyObservers(DeliveryRequest deliveryRequest) {
        for (Observer observer : observers) {
            observer.update(deliveryRequest);
        }
    }
}
