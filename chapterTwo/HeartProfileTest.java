package chapterTwo;

public class HeartProfileTest {
    public static void main(String[] args) {
        HealthProfile myHealth = new HealthProfile("Goodness","Obinali","Female","Saturday",
                "October",2000,1.77,52.9);
        System.out.printf("%s%s%s%s%n%s%s%n%s%s%s%s%s%d%n%s%.2f%n%s%.1f%n%s%d%s%n%s%.2f%n%s%d%n%s%d","Your name is ",myHealth.getFirstName()," ",
                myHealth.getLastName(),"Gender: ",myHealth.getGender(), "Date of birth: ",myHealth.getDay()," ",myHealth.getMonth()," ",
                myHealth.getYear(),"Height: ",myHealth.getHeight(),"Weight: ",myHealth.getWeight(), "You are ",myHealth.getAge()," years old",
                "Your BMI is ",myHealth.getBMI(),"your maximum heart rate is ",myHealth.getMaximumHeartRate(),"your target heart rate is ",
                myHealth.getTargetHeartRate());
    }
}
