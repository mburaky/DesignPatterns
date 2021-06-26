package tr.mby.com.structural.adapter;

public class CarAdapterImpl implements CarAdapter {

    Car carWithSpeedMhp;

    public CarAdapterImpl(Car carWithSpeedMhp) {
        this.carWithSpeedMhp = carWithSpeedMhp;
    }

    @Override
    public double getMaxSpeed() {
        return convertMPHtoKMPH(this.carWithSpeedMhp.getMaxSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
