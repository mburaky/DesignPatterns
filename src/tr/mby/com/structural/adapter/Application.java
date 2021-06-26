package tr.mby.com.structural.adapter;

import tr.mby.com.structural.adapter.car.BugattiVeyron;
import tr.mby.com.structural.adapter.car.Car;

public class Application {

    public static void main(String[] args) {
        Car bugattiVeyron = new BugattiVeyron();
        CarAdapter bugattiVeyronAdapter = new CarAdapterImpl(bugattiVeyron);

        System.out.println("Max speed in km: " + bugattiVeyron.getMaxSpeed());
        System.out.println("Max speed in mhp: " + bugattiVeyronAdapter.getMaxSpeed());

        // OUTPUT
        // Max speed in km: 298.0
        // Max speed in mhp: 479.58332
    }
}
