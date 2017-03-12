package com.bvan.oop.lessons5_6.oop.taxi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class TaxiRides {

    private final List<TaxiRide> rides = new ArrayList<>();

    public void addRide(TaxiRide ride) {
        rides.add(ride);
    }

    public long getPrice(TaxiTariff rate) {
        long price = 0L;

        for (TaxiRide ride : rides) {
            price += rate.calculatePrice(ride);
        }

        return price;
    }

    public long getPrice() {
        long price = 0L;

        for (TaxiRide ride : rides) {
            price += ride.getPrice();
        }

        return price;
    }
}
