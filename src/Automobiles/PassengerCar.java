package Automobiles;

public class PassengerCar extends Automobile implements Competing {
    String bodyType;

    public PassengerCar(String brand, String model, double engineSize, String bodyType) {
        super(brand, model, engineSize);

        if (bodyType.equalsIgnoreCase("СЕДАН")) {
            this.bodyType = "седан";
        } else {
            if (bodyType.equalsIgnoreCase("КУПЕ")) {
                this.bodyType = String.format(BodyType.COUPE.getBodyType());
            } else {
                if (bodyType.equalsIgnoreCase("КРОССОВЕР")) {
                    this.bodyType = String.format(BodyType.CROSS_OVER.getBodyType());
                } else {
                    if (bodyType.equalsIgnoreCase("ХЭТЧБЭК")) {
                        this.bodyType = String.format(BodyType.HATCHBACK.bodyType);
                    } else {
                        if (bodyType.equalsIgnoreCase("МИНИВЭН")) {
                            this.bodyType = String.format(BodyType.MINI_VAN.bodyType);
                        } else {
                            if (bodyType.equalsIgnoreCase("ВНЕДОРОЖНИК")) {
                                this.bodyType = String.format(BodyType.OFF_ROAD.bodyType);
                            } else {
                                if (bodyType.equalsIgnoreCase("ПИКАП")) {
                                    this.bodyType = String.format(BodyType.PICK_UP.bodyType);
                                } else {
                                    if (bodyType.equalsIgnoreCase("УНИВЕРСАЛ")) {
                                        this.bodyType = String.format(BodyType.UNIVERSAL.bodyType);
                                    } else {
                                        if (bodyType.equalsIgnoreCase("ФУРГОН")) {
                                            this.bodyType = String.format(BodyType.WAGON.bodyType);
                                        } else {
                                            this.bodyType = " Информации не достаточно ";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public enum BodyType {
        SEDAN("седан"),
        COUPE("купе"),
        CROSS_OVER("кроссовер"),
        HATCHBACK("хэтчбек"),
        MINI_VAN("минивэн"),
        OFF_ROAD("внедорожник"),
        PICK_UP("пикап"),
        UNIVERSAL("универсал"),
        WAGON("фургон");
        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return this.bodyType;
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
