package Automobiles;

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

        Buses ikarus = new Buses("Ikarus", "5601", 12.0);
        Buses paz = new Buses("ПАЗ", "53-20", 10.0);
        Buses liaz = new Buses("ЛиАЗ", "678", 11.5);
        Buses laz = new Buses("ЛАЗ", "79321", 9.0);
        System.out.println(ikarus + "\n" + paz + "\n" + liaz + "\n" + laz);
        ikarus.startMoving();
        ikarus.finishTheMove();
        System.out.println(ikarus.bestTime(22.0) + "\n" + ikarus.pitStop());

        Tracks man = new Tracks("Man", "467", 10.0);
        Tracks tatra = new Tracks("Tatra", "900", 15.0);
        Tracks maz = new Tracks("MAZ", "2", 11.0);
        Tracks kamaz = new Tracks("KamAZ", "4389", 10.0);
        System.out.println(man + "\n" + tatra + "\n" + maz + "\n" + kamaz);
        man.startMoving();
        man.finishTheMove();
        System.out.println(man.bestTime(25.5) + "\n" + maz.pitStop() + "\n" + tatra.maxSpeed(92.4));

        DriverB misha<PassengerCar> = new DriverB<>("Миша", "B", 10);
        System.out.println("Водитель " + misha.getName() + " управляет автомобилем " + audi.getBrand() +
                " и будет участвовать в заезде");
    }
}
