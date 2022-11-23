package mechanics;

import Automobiles.Automobile;

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

    public void carryOutMaintenance() {
        System.out.println("Требуется техобслуживание");
    }

    public void fixTheCar() {
        System.out.println("Требуется ремонт");
    }
}
