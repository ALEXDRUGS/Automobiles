package drivers;

import Automobiles.Automobile;
import Automobiles.Competing;

import java.util.LinkedList;

public abstract class Driver<T extends Automobile & Competing> {
    private String name;
    private String category;
    private int expirience;
    private T car;

    protected Driver(String name, String category, int expirience, T car) {
        this.name = name;
        this.category = category;
        this.expirience = expirience;
        this.car = car;
    }
    private LinkedList<Driver> driverLinkedList;

    public Driver(LinkedList<Driver> driverLinkedList) {
        this.driverLinkedList = driverLinkedList;
    }

    public LinkedList<Driver> getDriverLinkedList() {
        return driverLinkedList;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        if (category == null || category.isEmpty() || category.isBlank()) {
            throw new RuntimeException("Необходимо указать тип прав");
        } else {
            return String.format("Права категории %s", category);
        }
    }


    public int getExpirience() {
        return expirience;
    }


    public void start() {
        System.out.printf("Автомобиль %s %s стартует\n", car.getBrand(), car.getModel());
    }

    public void finish() {
        System.out.printf("Автомобиль %s %s финиширует\n", car.getBrand(), car.getModel());
    }

    public void refuel() {
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
