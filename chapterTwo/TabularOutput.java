package chapterTwo;

public class TabularOutput {
    public static void main(String[] args) {
       int counter = 1;
       int n1 = 0;
       int n2 = 0;
       int n3 = 0;
        while(counter<=5){
          n1 = counter * counter;
          n2 = counter * counter * counter;
          n3 = counter * counter * counter * counter;
           counter = counter + 1;

        }
        System.out.printf("%n%s%5s%5s%n","N","N2","N3");
        System.out.printf("%2d %d ",n1,n2,n3);

    }
}
