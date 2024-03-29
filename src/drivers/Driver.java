package drivers;

import Automobiles.Automobile;
import Automobiles.Competing;

import java.util.Objects;
import java.util.Set;

public abstract class Driver<T extends Automobile & Competing> {
    private String name;
    private String category;
    private Integer expirience;
    private T car;

    protected Driver(String name, String category, Integer expirience, T car) {
        this.name = name;
        this.category = category;
        this.expirience = expirience;
        this.car = car;
    }
    private Set<Driver> driverSet;

    public Driver(Set<Driver> driverSet) {
        this.driverSet = driverSet;
    }

    public Set<Driver> getDriverSet() {
        return driverSet;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return expirience == driver.expirience && name.equals(driver.name) && category.equals(driver.category) && car.equals(driver.car) && driverSet.equals(driver.driverSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, expirience, car, driverSet);
    }
}
