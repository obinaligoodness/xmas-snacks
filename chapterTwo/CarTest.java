package chapterTwo;

public class CarTest {
    public static void main(String[] args) {
        Car car2 = new Car ("2003","benz",3_000_000.0,5);
        Car car1 = new Car("2004","camry",4_000_000.0,7);

      System.out.println(car2.getPrice());
    }
}
