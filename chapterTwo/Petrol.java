package chapterTwo;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("sabo", "diesel", 8, 500, 5 );

        System.out.println( petrolPurchase.getPurchaseAmount());

    }
}