public abstract class Transport {

    protected String brand;
    protected String model;
    protected Integer productionYear;
    protected String productionCountry;
    protected String color;
    protected int maximumSpeed;

    protected abstract void refill(Boolean gasoline,Boolean diesel, Boolean electro);

    public Transport(String brand, String model, Integer productionYear, String productionCountry,
                     String color, int maximumSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maximumSpeed = maximumSpeed;



    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null)
            this.color = " цвет не указан ";
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        if (maximumSpeed <= 0) {
            this.maximumSpeed = 0;
        } else {
            this.maximumSpeed = maximumSpeed;
        }

    }


    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isBlank();
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", maximumSpeed=" + maximumSpeed +
                '}';
    }
}





