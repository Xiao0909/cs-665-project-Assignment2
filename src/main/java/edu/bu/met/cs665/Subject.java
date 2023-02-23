// /**
//  * Name: Xiao Xiao
//  * Course: CS-665 Software Designs & Patterns
//  * Date: 2/21/2023
//  * File Name: Observer.java
//  * Description: remove register and notify the observer which are the drivers
//  */

package edu.bu.met.cs665;

public interface Subject {
        /**
         * Register an observer with observer object.
         *
         * @param register an observer
         */
        void registerObserver(Observer observer);

        /**
         * remove an observer with observer object.
         *
         * @param remove an observer
         */
        void removeObserver(Observer observer);
    
        /**
         * notify observers with delivery request
         *
         */
        void notifyObservers(DeliveryRequest deliveryRequest);
    
}
