package Automobiles;

public class Track extends Automobile implements Competing {

    String loadCapacity;

    public Track(String brand, String model, double engineSize, double loadCapacity) {
        super(brand, model, engineSize);
        if (loadCapacity < LoadCapacity.N1.getTo()) {
            this.loadCapacity = String.format("Грузоподъёмность от %s до %s ",
                    LoadCapacity.N1.getFrom(),
                    LoadCapacity.N1.getTo());
        } else {
            if (loadCapacity >= LoadCapacity.N2.getFrom() && loadCapacity <= LoadCapacity.N2.getTo()) {
                this.loadCapacity = String.format("Грузоподъёмность от %s до %s ",
                        LoadCapacity.N2.getFrom(),
                        LoadCapacity.N2.getTo());
            } else {
                if (loadCapacity > LoadCapacity.N3.getFrom()) {
                    this.loadCapacity = String.format("Грузоподъёмность от %s и более ",
                            LoadCapacity.N3.getFrom());
                } else {
                    this.loadCapacity = " Информации не достаточно ";
                }
            }
        }
    }

    public enum LoadCapacity {
        N1(0.0, 3.5),
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
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setEngineSize(double engineSize) {
        super.setEngineSize(engineSize);
    }

    @Override
    public String toString() {
        return super.toString() + loadCapacity;
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

    @Override
    public void getDiagnosed(Automobile getDiagnosed) {
        super.getDiagnosed(getDiagnosed);
    }
}
