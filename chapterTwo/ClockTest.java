package chapterTwo;

public class ClockTest {
    public static void main(String[] args) {
       Clock clock = new Clock(9,46,34);
    System.out.printf("%d%s%d%s%d",clock.getHour(),": ",clock.getMinute(),": ",clock.getSeconds());
    }
}
