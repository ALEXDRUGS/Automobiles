package Automobiles;

public class DriverB extends Driver<PassengerCar>{

    public DriverB(String name, String category, int expirience) {
        super(name, category, expirience);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }

    @Override
    public int getExpirience() {
        return super.getExpirience();
    }

    @Override
    public void setExpirience(int expirience) {
        super.setExpirience(expirience);
    }

    @Override
    public void start() {

    }

    @Override
    public void finish() {

    }

    @Override
    public void refuel() {

    }
}
