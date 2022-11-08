package Automobiles;

public class Bus extends Automobile implements Competing {
    private final Capacity busCapacity;

    public Bus(String brand, String model, double engineSize, Capacity busCapacity) {
        super(brand, model, engineSize);
        this.busCapacity = busCapacity;
    }

    public enum Capacity {
        ESPECIALLY_SMALL(0, 10), SMALL(10, 25), MIDDLE(40, 50),
        BIG(60, 80), ESPECIALLY_BIG(100, 120);
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

    public void printType() {
        if (busCapacity != null) {
            System.out.println(this.busCapacity);
        } else {
            System.out.println("Информации не достаточно");
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
        return super.toString();
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
