package Automobiles;

import drivers.Driver;
import mechanics.Mechanic;
import sponsors.Sponsor;

import java.util.Objects;
import java.util.Set;

public abstract class Automobile {
    private String brand;
    private String model;
    private Double engineSize;
    private Driver driver;
    private Sponsor sponsor;
    private Mechanic mechanic;
    private Automobile getDiagnosed;

    public Automobile(Driver driver, Sponsor sponsor, Mechanic mechanic) {
        this.driver = driver;
        this.sponsor = sponsor;
        this.mechanic = mechanic;
    }

    public Automobile(String brand, String model, Double engineSize) {
        this.brand = brand;
        this.model = model;
        this.engineSize = engineSize;
       // this.automobileSet = new HashSet<>();
    }

    private Set<Automobile> automobileSet;


    public Automobile(Set<Automobile> automobileSet) {
        this.automobileSet = automobileSet;
    }

    public Set<Automobile> getAutomobileSet() {
        return automobileSet;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && brand.isBlank()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank()) {
            this.model = model;
        }
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Double engineSize) {
        if (engineSize > 0) {
            this.engineSize = engineSize;
        }
    }

    @Override
    public String toString() {
        return " Марка " + getBrand() + " Модель " + getModel() +
                " Объём двигателя " + getEngineSize() +
                " л ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobile that = (Automobile) o;
        return Double.compare(that.engineSize, engineSize) == 0 && brand.equals(that.brand) && model.equals(that.model) && driver.equals(that.driver) && sponsor.equals(that.sponsor) && mechanic.equals(that.mechanic) && automobileSet.equals(that.automobileSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineSize, driver, sponsor, mechanic, automobileSet);
    }

    public void getDiagnosed(Automobile getDiagnosed) {
        if (getDiagnosed.getClass().equals(Bus.class)) {
            this.getDiagnosed = getDiagnosed;
            System.out.println("Автобус " + getDiagnosed + " в диагностике не нуждается");
        } else throw new RuntimeException("Автомобиль " + getDiagnosed + " не прошёл диагностику");
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public void getData(Automobile automobile) {
        String data = String.format("%s %s %s", automobile.getDriver().toString(),
                automobile.getSponsor().toString(), automobile.getMechanic().toString());
        if (data != null && !data.isBlank()) {
            System.out.println(data);
        }else System.out.println("error");
    }

    public abstract void startMoving();

    public abstract void finishTheMove();
}
