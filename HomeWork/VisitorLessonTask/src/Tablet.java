public  abstract class Tablet {
public String model;
public String brand;

    public Tablet(String model, String brand) {
    }

    public abstract  void accept(Visitor visitor);

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
