package Automobiles;

public abstract class Driver <T extends Automobiles & Competing> {
    private String name;
    private String category;
    private int expirience;

    public Driver(String name, String category, int expirience) {
        this.name = name;
        this.category = category;
        this.expirience = expirience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if(category != null && category.isBlank()) {
            this.category = category;
        }
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        if (expirience > 0) {
            this.expirience = expirience;
        }
    }

    public abstract void start();

    public abstract void finish();

    public abstract void refuel();

}
