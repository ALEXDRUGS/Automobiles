package Automobiles;

public class Track extends Automobile implements Competing {
    public Track(String brand, String model, double engineSize) {
        super(brand, model, engineSize);
    }

    public enum LoadCapacity {
        N1(Double.MIN_VALUE, 3.5),
        N2(3.5, 12.0),
        N3(12.0, Double.MAX_VALUE);
        private final double from;
        private final double to;
        LoadCapacity(double from, double to) {
            this.from = from;
            this.to = to;
        }

        public double getFrom() {
            return from;
        }

        public double getTo() {
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
