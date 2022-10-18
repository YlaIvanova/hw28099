
public class Bus extends Transport {

    public String statusRefill;


    public Bus (String brand, String model, Integer productionYear, String productionCountry,
                     String color, int maximumSpeed,String typeOfEngine) {
        super(brand,model,productionYear,productionCountry,color,maximumSpeed);

    }

    @Override
    public String toString() {
        return "Bus{} " + super.toString() + statusRefill;

    }

    @Override
    public void refill(Boolean gasoline,Boolean diesel, Boolean electro) {
        {
        if (gasoline || diesel) {
            statusRefill = "заправлен";
        }else {
            statusRefill = " не заправлен";
        }

        }
    }


}
