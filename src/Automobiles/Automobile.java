package Automobiles;

public abstract class Automobile {
    private String brand;
    private String model;
    private double engineSize;

    public Automobile(String brand, String model, double engineSize) {
        this.brand = brand;
        this.model = model;
        this.engineSize = engineSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && brand.isBlank()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank()) {
            this.model = model;
        }
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        if (engineSize > 0) {
            this.engineSize = engineSize;
        }
    }

    @Override
    public String toString() {
        return " Марка " + getBrand() + " Модель " + getModel() +
                " Объём двигателя " + getEngineSize() +
                " л ";
    }

    public void getDiagnosed(Automobile getDiagnosed) {
        if (getDiagnosed.getClass().equals(Bus.class)) {
            System.out.println("Автобус " + getDiagnosed + " в диагностике не нуждается");
        }else throw new RuntimeException("Автомобиль " + getDiagnosed + " не прошёл диагностику");
    }
    public abstract void startMoving();

    public abstract void finishTheMove();
}
