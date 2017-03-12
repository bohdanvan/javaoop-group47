package com.bvan.oop.lessons5_6.oop.taxi;

/**
 * @author bvanchuhov
 */
public interface TaxiTariff {
    String getName();
    long calculatePrice(TaxiRide ride);
}
