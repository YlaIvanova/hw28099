public class Train extends Transport {

    public double priceOfTheTrip;

    public double travelTime;

    public String nameOfTheDepartureStation;

    public String finalStop;

    public int numberOfWagons;
    public String statusRefill;


        public double getPriceOfTheTrip () {
            return priceOfTheTrip;
        }

        public void setPriceOfTheTrip ( double priceOfTheTrip){
            if (priceOfTheTrip <= 0)
                priceOfTheTrip = 0;
        }

        public double getTravelTime () {
            return travelTime;
        }

        public void setTravelTime ( double travelTime){
            if (travelTime <= 0)
                travelTime = 0;
        }

        public String getNameOfTheDepartureStation () {
            return nameOfTheDepartureStation;
        }

        public void setNameOfTheDepartureStation (String nameOfTheDepartureStation){
            if (nameOfTheDepartureStation == null)
                nameOfTheDepartureStation = "Станция не указана!";
        }

        public String getFinalStop () {
            return finalStop;
        }

        public void setFinalStop (String finalStop){
            if (finalStop == null)
                finalStop = "Станция не указана!";
        }

        public int getNumberOfWagons () {
            return numberOfWagons;
        }

        public void setNumberOfWagons ( int numberOfWagons){
            if (numberOfWagons <= 0)
                numberOfWagons = 0;
        }
        public Train(String brand, String model, Integer productionYear, String productionCountry,
                String color, Integer maximumSpeed, double priceOfTheTrip, double travelTime,
                String nameOfTheDepartureStation, String finalStop,
                int numberOfWagons) {
                super(brand, model, productionYear, productionCountry, color, maximumSpeed);
                this.priceOfTheTrip = priceOfTheTrip;
                this.travelTime = travelTime;
                this.nameOfTheDepartureStation = nameOfTheDepartureStation;
                this.finalStop = finalStop;
                this.numberOfWagons = numberOfWagons;


    }


    @Override
    public void refill(Boolean gasoline,Boolean diesel, Boolean electro) {
            if (diesel ){
                statusRefill = "заправлен";
                System.out.println("Нужно заправить дизелем!");
            }

    }
}
