package chapterTwo;

public class Car {
    private String model;
    private String type;
    private double price;
    private int discount;

    public Car(String model, String type, double price,int discount){
        this.model = model;
        this.type = type;
        if(price > 0)
        this.price = price-(price*(discount/100));
        this.discount = discount ;
    }

    public void setModel(String model ){
         this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price = price - ((discount/100)*price);
    }
}
