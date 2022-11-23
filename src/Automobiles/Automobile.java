package Automobiles;

import drivers.Driver;
import mechanics.Mechanic;
import sponsors.Sponsor;

import java.util.LinkedList;

public abstract class Automobile {
    private String brand;
    private String model;
    private double engineSize;
    private Driver driver;
    private Sponsor sponsor;
    private Mechanic mechanic;

    public Automobile(Driver driver, Sponsor sponsor, Mechanic mechanic) {
        this.driver = driver;
        this.sponsor = sponsor;
        this.mechanic = mechanic;
    }

    public Automobile(String brand, String model, double engineSize) {
        this.brand = brand;
        this.model = model;
        this.engineSize = engineSize;
        this.automobileLinkedList = new LinkedList<>();
    }

    private LinkedList<Automobile> automobileLinkedList;


    public Automobile(LinkedList<Automobile> automobileLinkedList) {
        this.automobileLinkedList = automobileLinkedList;
    }

    public LinkedList<Automobile> getAutomobileLinkedList() {
        return automobileLinkedList;
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

    public void setEngineSize(double engineSize) {
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

    public void getDiagnosed(Automobile getDiagnosed) {
        if (getDiagnosed.getClass().equals(Bus.class)) {
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
