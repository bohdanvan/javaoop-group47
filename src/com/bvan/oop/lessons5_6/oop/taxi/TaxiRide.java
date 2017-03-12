package com.bvan.oop.lessons5_6.oop.taxi;

/**
 * @author bvanchuhov
 */
public class TaxiRide {

    private final int passengers;
    private final int distance;
    private final int duration;
    private final TaxiTariff tariff;

    public TaxiRide(int passengers, int distance, int duration, TaxiTariff tariff) {
        this.passengers = passengers;
        this.distance = distance;
        this.duration = duration;
        this.tariff = tariff;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    public long getPrice() {
        return tariff.calculatePrice(this);
    }

    @Override
    public String toString() {
        return "TaxiRide{" +
                "passengers=" + passengers +
                ", distance=" + distance +
                ", duration=" + duration +
                ", tariff=" + tariff.getName() +
                '}';
    }
}
