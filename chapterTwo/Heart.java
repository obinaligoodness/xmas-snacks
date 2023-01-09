package chapterTwo;

public class Heart {
    public static void main(String[] args) {
Heartrates input = new Heartrates("Goodness","obinali","Thursday","October",2000);
System.out.printf("%s%s%s%s%n%s%s%s%s%s%d%n%s%d%s%n%s%d%n%s%d","Your name is ",input.getFirstName()," ",input.getLastName(),"your date of birth is: ",
        input.getDay()," ",input.getMonth()," ",input.getYear(),"You are ",input.getAge()," years old","Your maximum heart rate is ",
        input.maximumHeartRate(),"Your target heart rate is ",input.targetHeartRate());
    }
}
