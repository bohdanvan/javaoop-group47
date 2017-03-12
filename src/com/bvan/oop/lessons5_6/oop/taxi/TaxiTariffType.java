package com.bvan.oop.lessons5_6.oop.taxi;

/**
 * @author bvanchuhov
 */
public enum TaxiTariffType implements TaxiTariff {
    STANDARD {
        @Override
        public long calculatePrice(TaxiRide ride) {
            return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
        }
    },
    FAMILY {
        @Override
        public long calculatePrice(TaxiRide ride) {
            return 30 + 20 * ride.getDistance() / ride.getPassengers();
        }
    };

    @Override
    public String getName() {
        return name();
    }
}
