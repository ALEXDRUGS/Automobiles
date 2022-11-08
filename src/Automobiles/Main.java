package Automobiles;

import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;

public class Main {
    public static void main(String[] args) {
        PassengerCar audi = new PassengerCar("Audi", "quattro", 2.0);
        PassengerCar vw = new PassengerCar("Volkswagen", "Golf", 1.8);
        PassengerCar mazda = new PassengerCar("Mazda", "Z5", 3.0);
        PassengerCar ford = new PassengerCar("Ford", "Focus", 1.7);
        System.out.println(audi + "\n" + vw + "\n" + mazda + "\n" + ford);
        audi.startMoving();
        audi.finishTheMove();
        System.out.println(audi.bestTime(20.0) + "\n" + audi.pitStop());

        Bus ikarus = new Bus("Ikarus", "5601", 12.0, Bus.Capacity.BIG);
        Bus paz = new Bus("ПАЗ", "53-20", 10.0, Bus.Capacity.MIDDLE);
        Bus liaz = new Bus("ЛиАЗ", "678", 11.5, Bus.Capacity.SMALL);
        Bus laz = new Bus("ЛАЗ", "79321", 9.0, Bus.Capacity.ESPECIALLY_BIG);
        System.out.println(ikarus + "\n" + paz + "\n" + liaz + "\n" + laz);
        ikarus.startMoving();
        ikarus.finishTheMove();
        System.out.println(ikarus.bestTime(22.0) + "\n" + ikarus.pitStop());

        Track man = new Track("Man", "467", 10.0);
        Track tatra = new Track("Tatra", "900", 15.0);
        Track maz = new Track("MAZ", "2", 11.0);
        Track kamaz = new Track("KamAZ", "4389", 10.0);
        System.out.println(man + "\n" + tatra + "\n" + maz + "\n" + kamaz);
        man.startMoving();
        man.finishTheMove();
        System.out.println(man.bestTime(25.5) + "\n" + maz.pitStop() + "\n" + tatra.maxSpeed(92.4));

        DriverB misha = new DriverB("Миша", "B", 10, audi);
        System.out.println(misha);
        misha.start();
        misha.refuel();
        misha.finish();
        DriverC vova = new DriverC("Вова", "C", 8, man);
        System.out.println(vova);
        DriverD max = new DriverD("Макс", "D", 15, ikarus);
        System.out.println(max);

    }
}
