package edu.bu.met.cs665;
/**
 * Name: Xiao Xiao
 * Course: CS-665 Software Designs & Patterns
 * Date: 2-21-2023
 * File Name: Person.java
 * Description: This class is responsible for the delivery request.
 */

public interface Observer {
    /**
     *deliveryRequest object is used to update the delivery request
     *
     * @param delivery request
     */
    void update(DeliveryRequest deliveryRequest);
}
