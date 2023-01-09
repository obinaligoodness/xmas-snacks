package chapterTwo;

public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int quantityOfPetrol;
    private double pricePerLiter;
    private double percentageDiscount;
    private double purchaseAmount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantityOfPetrol, double pricePerLiter,
                          double percentageDiscount){
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantityOfPetrol = quantityOfPetrol;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }
    public void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;
    }
    public String getStationLocation(){
        return stationLocation;
    }

    public void setTypeOfPetrol(String typeOfPetrol){
        this.typeOfPetrol = typeOfPetrol;
    }
    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }
    public void setQuantityOfPetrol(int quantityOfPetrol){
        this.quantityOfPetrol = quantityOfPetrol;
    }
    public int getQuantityOfPetrol(){
        return quantityOfPetrol;
    }
    public void setPricePerLiter(double pricePerLiter){
        this.pricePerLiter = pricePerLiter;
    }
    public double getPricePerLiter(){
        return pricePerLiter;
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount(){
        return percentageDiscount;
    }
    public double getPurchaseAmount(){
    return this.purchaseAmount = quantityOfPetrol * pricePerLiter - (percentageDiscount/100*(quantityOfPetrol*pricePerLiter));
    }
}