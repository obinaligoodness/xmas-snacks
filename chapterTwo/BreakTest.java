package chapterTwo;

public class BreakTest {
    public static void main(String[] args) {
        int counter;
        for(counter = 1; counter<= 10; counter++){
            if(counter==5){
               continue;
            }
            System.out.printf("%d%n",counter);
        }
       System.out.println(counter);
    }
}
