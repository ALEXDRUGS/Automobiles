package services;

import Automobiles.Automobile;
import Automobiles.Bus;

import java.util.LinkedList;
import java.util.Queue;

import static Automobiles.Main.automobileSet;

public class ServiceStation<E extends Automobile> {
    private final Queue<Automobile> cars = new LinkedList<>(automobileSet);

    public void addCars(E Automobile) {
        cars.offer(Automobile);
    }

    public void techService() {
        for (int i = 0; i < automobileSet.size(); i++) {
            Automobile E = cars.poll();
            assert E != null;
            if (E.getClass().equals(Bus.class)) {
                E.getDiagnosed(E);
            } else {
                System.out.println("Автомобиль " + E + " диагностику прошел");
            }
        }
    }
}

