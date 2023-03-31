package Automobiles;

import drivers.Driver;
import mechanics.Mechanic;
import sponsors.Sponsor;

public class Bus extends Automobile implements Competing {
    String bodyType;

    public Bus(Driver driver, Sponsor sponsor, Mechanic mechanic) {
        super(driver, sponsor, mechanic);
    }

    public Bus(String brand, String model, double engineSize, String bodyType) {
        super(brand, model, engineSize);
        if (bodyType.equalsIgnoreCase("SMALL")) {
            this.bodyType = String.format("Количество мест от %d до %d ", Capacity.SMALL.getFrom(),
                    Capacity.SMALL.getTo());
        } else {
            if (bodyType.equalsIgnoreCase("ESPECIALLY_SMALL")) {
                this.bodyType = String.format("Количество мест от %d до %d ", Capacity.ESPECIALLY_SMALL.getFrom(),
                        Capacity.ESPECIALLY_SMALL.getTo());
            } else {
                if (bodyType.equalsIgnoreCase("MIDDLE")) {
                    this.bodyType = String.format("Количество мест от %d до %d ", Capacity.MIDDLE.getFrom(),
                            Capacity.MIDDLE.getTo());
                } else {
                    if (bodyType.equalsIgnoreCase("BIG")) {
                        this.bodyType = String.format("Количество мест от %d до %d ", Capacity.BIG.getFrom(),
                                Capacity.BIG.getTo());
                    } else {
                        if (bodyType.equalsIgnoreCase("ESPECIALLY_BIG")) {
                            this.bodyType = String.format("Количество мест от %d до %d ", Capacity.ESPECIALLY_BIG.getFrom(),
                                    Capacity.ESPECIALLY_BIG.getTo());
                        } else {
                            this.bodyType = " Информации не достаточно ";
                        }
                    }
                }
            }
        }
    }


    public enum Capacity {
        ESPECIALLY_SMALL(0, 10),
        SMALL(10, 25),
        MIDDLE(40, 50),
        BIG(60, 80),
        ESPECIALLY_BIG(100, 120);
        private final int from;
        private final int to;

        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }
    }


    @Override
    public void startMoving() {
        System.out.println("start");
    }

    @Override
    public void finishTheMove() {
        System.out.println("finish");
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public double getEngineSize() {
        return super.getEngineSize();
    }

    @Override
    public String toString() {
        return super.toString() + bodyType;
    }

    @Override
    public String pitStop() {
        return "PIT-STOP";
    }

    @Override
    public double bestTime(double time) {
        double bestTime = Double.MIN_VALUE;
        if (time > bestTime) {
            bestTime = time;
        }
        return bestTime;
    }

    @Override
    public double maxSpeed(double speed) {
        double maxSpeed = Double.MIN_VALUE;
        if (speed > maxSpeed) {
            maxSpeed = speed;
        }
        return maxSpeed;
    }

}
