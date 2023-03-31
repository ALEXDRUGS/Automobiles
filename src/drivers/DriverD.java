package drivers;

import Automobiles.Bus;

public class DriverD extends Driver<Bus>{
    public DriverD(String name, String category, int expirience, Bus car) {
        super(name, category, expirience, car);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }
}
