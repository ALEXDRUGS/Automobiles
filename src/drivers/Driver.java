package drivers;

import Automobiles.Automobile;
import Automobiles.Competing;

public abstract class Driver<T extends Automobile & Competing> {
    private final String name;
    private final String category;
    private final int expirience;
    private final T car;

    protected Driver(String name, String category, int expirience, T car) {
        this.name = name;
        this.category = category;
        this.expirience = expirience;
        this.car = car;
    }

    public String getName() {
        return name;
    }


    public String getCategory() {
        return category;
    }


    public int getExpirience() {
        return expirience;
    }


    public void start(){
        System.out.printf("Автомобиль %s %s стартует\n", car.getBrand(), car.getModel());
    }

    public void finish(){
        System.out.printf("Автомобиль %s %s финиширует\n", car.getBrand(), car.getModel());
    }

    public void refuel(){
        System.out.printf("Автомобиль %s %s на заправку\n", car.getBrand(), car.getModel());
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в гонке.",
                name,
                car.getBrand(),
                car.getModel());
    }
}
