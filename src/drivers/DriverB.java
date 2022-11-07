package drivers;

import Automobiles.PassengerCar;
public class DriverB extends Driver<PassengerCar> {
    public DriverB(String name, String category, int expirience, PassengerCar car) {
        super(name, category, expirience, car);
    }
}
