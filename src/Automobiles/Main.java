package Automobiles;

import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import mechanics.Mechanic;
import services.ServiceStation;
import sponsors.Sponsor;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static Set<Automobile> automobileSet = new HashSet<>();
    static Set<Sponsor> sponsorSet = new HashSet<>();
    static Set<Driver> driverSet = new HashSet<>();
    static Set<Mechanic> mechanicSet = new HashSet<>();


    public static void main(String[] args) {


        Sponsor lukoil = new Sponsor("Лукойл", 100);
        Sponsor a = new Sponsor("A", 250);
        Sponsor b = new Sponsor("B", 130);
        Sponsor c = new Sponsor("C", 145);
        Sponsor d = new Sponsor("D", 324);
        Sponsor e = new Sponsor("E", 87);
        Sponsor f = new Sponsor("F", 67);
        Sponsor g = new Sponsor("G", 98);
        Sponsor h = new Sponsor("H", 709);
        Sponsor i = new Sponsor("I", 68);
        Sponsor j = new Sponsor("J", 75);
        Sponsor k = new Sponsor("K", 20);
        Sponsor l = new Sponsor("L", 10);
        Sponsor m = new Sponsor("M", 46);
        Sponsor n = new Sponsor("N", 900);
        Sponsor o = new Sponsor("O", 1000);
        Sponsor p = new Sponsor("P", 42);
        Sponsor q = new Sponsor("Q", 37);
        Sponsor r = new Sponsor("R", 90);
        Sponsor s = new Sponsor("S", 76);
        Sponsor t = new Sponsor("T", 77);
        Sponsor u = new Sponsor("U", 95);
        Sponsor v = new Sponsor("V", 63);
        Sponsor w = new Sponsor("W", 71);
        lukoil.sponsorRace();

        sponsorSet.add(lukoil);
        sponsorSet.add(a);
        sponsorSet.add(b);
        sponsorSet.add(c);
        sponsorSet.add(d);
        sponsorSet.add(e);
        sponsorSet.add(f);
        sponsorSet.add(g);
        sponsorSet.add(h);
        sponsorSet.add(i);
        sponsorSet.add(j);
        sponsorSet.add(k);
        sponsorSet.add(l);
        sponsorSet.add(m);
        sponsorSet.add(n);
        sponsorSet.add(o);
        sponsorSet.add(p);
        sponsorSet.add(q);
        sponsorSet.add(r);
        sponsorSet.add(s);
        sponsorSet.add(t);
        sponsorSet.add(u);
        sponsorSet.add(v);
        sponsorSet.add(w);

        PassengerCar audi = new PassengerCar("Audi", "quattro", 2.0, "седан");
        PassengerCar vw = new PassengerCar("Volkswagen", "Golf", 1.8, "хэтчбэк");
        PassengerCar mazda = new PassengerCar("Mazda", "Z5", 3.0, "кроссовер");
        PassengerCar ford = new PassengerCar("Ford", "Batford", 5.7, "фургон");
        System.out.println(audi + "\n" + vw + "\n" + mazda + "\n" + ford);
        audi.startMoving();
        audi.finishTheMove();
        System.out.println(audi.bestTime(20.0) + "\n" + audi.pitStop());
        automobileSet.add(audi);
        automobileSet.add(vw);
        automobileSet.add(mazda);
        automobileSet.add(ford);

        Bus ikarus = new Bus("Ikarus", "5601", 12.0, "BIG");
        Bus paz = new Bus("ПАЗ", "53-20", 10.0, "MIDDLE");
        Bus liaz = new Bus("ЛиАЗ", "678", 11.5, "SMALL");
        Bus laz = new Bus("ЛАЗ", "79321", 9.0, "ESPECIALLY_BIG");
        System.out.println(ikarus + "\n" + paz + "\n" + liaz + "\n" + laz);
        ikarus.startMoving();
        ikarus.finishTheMove();
        System.out.println(ikarus.bestTime(22.0) + "\n" + ikarus.pitStop());
        automobileSet.add(ikarus);
        automobileSet.add(paz);
        automobileSet.add(liaz);
        automobileSet.add(laz);


        Track man = new Track("Man", "467", 10.0, 10.0);
        Track tatra = new Track("Tatra", "900", 15.0, 2.2);
        Track maz = new Track("MAZ", "2", 11.0, 25.9);
        Track kamaz = new Track("KamAZ", "4389", 10.0, 100.5);
        System.out.println(man + "\n" + tatra + "\n" + maz + "\n" + kamaz);
        man.startMoving();
        man.finishTheMove();

        System.out.println(man.bestTime(25.5) + "\n" + maz.pitStop() + "\n" + tatra.maxSpeed(92.4));
        automobileSet.add(man);
        automobileSet.add(tatra);
        automobileSet.add(maz);
        automobileSet.add(kamaz);
        automobileSet.add(kamaz);

        DriverB misha = new DriverB("Миша", "B", 10, audi);
        DriverB masha = new DriverB("Маша", "B", 10, vw);
        DriverB bob = new DriverB("Боб", "B", 10, mazda);
        DriverB chip = new DriverB("Чип", "B", 10, ford);

        System.out.println(misha);
        misha.start();
        misha.refuel();
        misha.finish();

        DriverC vova = new DriverC("Вова", "C", 8, man);
        DriverC vika = new DriverC("Вика", "C", 8, tatra);
        DriverC dik = new DriverC("Дик", "C", 8, maz);
        DriverC leo = new DriverC("Лео", "C", 8, kamaz);

        System.out.println(vova);

        DriverD max = new DriverD("Макс", "D", 15, ikarus);
        DriverD tima = new DriverD("Тима", "D", 8, paz);
        DriverD dima = new DriverD("Дима", "D", 8, liaz);
        DriverD fima = new DriverD("Фима", "D", 8, laz);

        driverSet.add(misha);
        driverSet.add(masha);
        driverSet.add(bob);
        driverSet.add(chip);
        driverSet.add(vova);
        driverSet.add(vika);
        driverSet.add(dik);
        driverSet.add(leo);
        driverSet.add(max);
        driverSet.add(tima);
        driverSet.add(dima);
        driverSet.add(fima);


        System.out.println(automobileSet);

        System.out.println(max + " " + max.getCategory()
                + " спонсоры " + sponsorSet.iterator().next()
                + " сумма спонсирования " + sponsorSet.iterator().next().getSumSupport()
                + " тугриков, " + sponsorSet.iterator().next()
                + " сумма спонсирования " + sponsorSet.iterator().next().getSumSupport()
                + " тугриков");
        System.out.println(vova + " " + vova.getCategory() + " спонсоры " + sponsorSet.iterator().next() + ", " + sponsorSet.iterator().next());
        System.out.println(misha + " " + misha.getCategory() + " спонсоры " + sponsorSet.iterator().next() + ", " + sponsorSet.iterator().next());
        ikarus.getDiagnosed(ikarus);

        Mechanic<Bus> vasya = new Mechanic<>("Вася Пупкин", "Trans", ikarus);
        Mechanic<PassengerCar> petya = new Mechanic<>("Петя Васечкин", "Rem", audi);
        Mechanic<Track> jora = new Mechanic<>("Жора Пушкин", "оотирр", man);
        Mechanic<Automobile> kolya = new Mechanic<>("Коля Дуров", "полрдбь", mazda);
        mechanicSet.add(vasya);
        mechanicSet.add(petya);
        mechanicSet.add(jora);
        mechanicSet.add(kolya);
        ikarus = new Bus(max, lukoil, vasya);
        ikarus.getData(ikarus);
        ServiceStation <Bus> serviceStation = new ServiceStation<>();
        serviceStation.addCars(ikarus);
        serviceStation.techService();
    }
}
