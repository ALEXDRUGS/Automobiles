package Automobiles;

import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import mechanics.Mechanic;
import services.ServiceStation;
import sponsors.Sponsor;

import java.util.LinkedList;

public class Main {
    public static LinkedList<Automobile> automobileLinkedList = new LinkedList<>();
    static LinkedList<Sponsor> sponsorLinkedList = new LinkedList<>();
    static LinkedList<Driver> driverLinkedList = new LinkedList<>();
    static LinkedList<Mechanic> mechanicLinkedList = new LinkedList<>();
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

        sponsorLinkedList.add(lukoil);
        sponsorLinkedList.add(a);
        sponsorLinkedList.add(b);
        sponsorLinkedList.add(c);
        sponsorLinkedList.add(d);
        sponsorLinkedList.add(e);
        sponsorLinkedList.add(f);
        sponsorLinkedList.add(g);
        sponsorLinkedList.add(h);
        sponsorLinkedList.add(i);
        sponsorLinkedList.add(j);
        sponsorLinkedList.add(k);
        sponsorLinkedList.add(l);
        sponsorLinkedList.add(m);
        sponsorLinkedList.add(n);
        sponsorLinkedList.add(o);
        sponsorLinkedList.add(p);
        sponsorLinkedList.add(q);
        sponsorLinkedList.add(r);
        sponsorLinkedList.add(s);
        sponsorLinkedList.add(t);
        sponsorLinkedList.add(u);
        sponsorLinkedList.add(v);
        sponsorLinkedList.add(w);

        PassengerCar audi = new PassengerCar("Audi", "quattro", 2.0, "седан");
        PassengerCar vw = new PassengerCar("Volkswagen", "Golf", 1.8, "хэтчбэк");
        PassengerCar mazda = new PassengerCar("Mazda", "Z5", 3.0, "кроссовер");
        PassengerCar ford = new PassengerCar("Ford", "Batford", 5.7, "фургон");
        System.out.println(audi + "\n" + vw + "\n" + mazda + "\n" + ford);
        audi.startMoving();
        audi.finishTheMove();
        System.out.println(audi.bestTime(20.0) + "\n" + audi.pitStop());
        automobileLinkedList.add(audi);
        automobileLinkedList.add(vw);
        automobileLinkedList.add(mazda);
        automobileLinkedList.add(ford);

        Bus ikarus = new Bus("Ikarus", "5601", 12.0, "BIG");
        Bus paz = new Bus("ПАЗ", "53-20", 10.0, "MIDDLE");
        Bus liaz = new Bus("ЛиАЗ", "678", 11.5, "SMALL");
        Bus laz = new Bus("ЛАЗ", "79321", 9.0, "ESPECIALLY_BIG");
        System.out.println(ikarus + "\n" + paz + "\n" + liaz + "\n" + laz);
        ikarus.startMoving();
        ikarus.finishTheMove();
        System.out.println(ikarus.bestTime(22.0) + "\n" + ikarus.pitStop());
        automobileLinkedList.add(ikarus);
        automobileLinkedList.add(paz);
        automobileLinkedList.add(liaz);
        automobileLinkedList.add(laz);


        Track man = new Track("Man", "467", 10.0, 10.0);
        Track tatra = new Track("Tatra", "900", 15.0, 2.2);
        Track maz = new Track("MAZ", "2", 11.0, 25.9);
        Track kamaz = new Track("KamAZ", "4389", 10.0, 100.5);
        System.out.println(man + "\n" + tatra + "\n" + maz + "\n" + kamaz);
        man.startMoving();
        man.finishTheMove();

        System.out.println(man.bestTime(25.5) + "\n" + maz.pitStop() + "\n" + tatra.maxSpeed(92.4));
        automobileLinkedList.add(man);
        automobileLinkedList.add(tatra);
        automobileLinkedList.add(maz);
        automobileLinkedList.add(kamaz);

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

        driverLinkedList.add(misha);
        driverLinkedList.add(masha);
        driverLinkedList.add(bob);
        driverLinkedList.add(chip);
        driverLinkedList.add(vova);
        driverLinkedList.add(vika);
        driverLinkedList.add(dik);
        driverLinkedList.add(leo);
        driverLinkedList.add(max);
        driverLinkedList.add(tima);
        driverLinkedList.add(dima);
        driverLinkedList.add(fima);


        System.out.println(automobileLinkedList);

        System.out.println(max + " " + max.getCategory()
                + " спонсоры " + sponsorLinkedList.get(0)
                + " сумма спонсирования " + sponsorLinkedList.get(0).getSumSupport()
                + " тугриков, " + sponsorLinkedList.get(1)
                + " сумма спонсирования " + sponsorLinkedList.get(1).getSumSupport()
                + " тугриков");
        System.out.println(vova + " " + vova.getCategory() + " спонсоры " + sponsorLinkedList.get(2) + ", " + sponsorLinkedList.get(3));
        System.out.println(misha + " " + misha.getCategory() + " спонсоры " + sponsorLinkedList.get(4) + ", " + sponsorLinkedList.get(5));
        ikarus.getDiagnosed(ikarus);

        Mechanic<Bus> vasya = new Mechanic<>("Вася Пупкин", "Trans", ikarus);
        Mechanic<PassengerCar> petya = new Mechanic<>("Петя Васечкин", "Rem", audi);
        Mechanic<Track> jora = new Mechanic<>("Жора Пушкин", "оотирр", man);
        Mechanic<Automobile> kolya = new Mechanic<>("Коля Дуров", "полрдбь", mazda);
        mechanicLinkedList.add(vasya);
        mechanicLinkedList.add(petya);
        mechanicLinkedList.add(jora);
        mechanicLinkedList.add(kolya);
        ikarus = new Bus(max, lukoil, vasya);
        ikarus.getData(ikarus);
        ServiceStation <Bus> serviceStation = new ServiceStation<>();
        serviceStation.addCars(ikarus);
        serviceStation.techService();
    }
}
