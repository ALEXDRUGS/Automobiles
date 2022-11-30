package mechanics;

import Automobiles.Automobile;

import java.util.Objects;

public class Mechanic<B extends Automobile> {
    private String fullName;
    private String firma;
    private B car;

    public Mechanic(String fullName, String firma, B car) {
        this.fullName = fullName;
        this.firma = firma;
        this.car = car;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public B getCar() {
        return car;
    }

    public void setCar(B car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Механик " + fullName + " фирма " + "\"" + firma + "\"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return fullName.equals(mechanic.fullName) && firma.equals(mechanic.firma) && car.equals(mechanic.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, firma, car);
    }

    public void carryOutMaintenance() {
        System.out.println("Требуется техобслуживание");
    }

    public void fixTheCar() {
        System.out.println("Требуется ремонт");
    }
}
