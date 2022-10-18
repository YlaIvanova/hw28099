import java.time.LocalDate;

public class Car extends Transport {

    public double engineVolume;
    public String transmission;

    private String bodyType;

    private int numberOfSeats;

    public String rubberSeason;
    public String typeOfEngine;
    public String statusRefill;

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getRubberSeason() {
        return rubberSeason;
    }

    public void setRubberSeason(String rubberSeason) {
        this.rubberSeason = rubberSeason;
    }

    public Car(String brand, String model, Integer productionYear, String productionCountry,
               String color, Integer maximumSpeed, double engineVolume, String transmission, String bodyType,
               int numberOfSeats, String rubberSeason, String typeOfEngine) {
        super(brand, model, productionYear, productionCountry, color, maximumSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
        this.rubberSeason = rubberSeason;
        this.typeOfEngine = typeOfEngine;

    }

    @Override
    public String toString() {
        return " engineVolume " + engineVolume + "} " + super.toString() + statusRefill;
    }

    @Override
    public void refill(Boolean gasoline, Boolean diesel, Boolean electro) {
        {
            if (gasoline || diesel || electro) {
                statusRefill = "заправлен";
            } else {
                statusRefill = " не заправлен";
            }

        }

    }
}
