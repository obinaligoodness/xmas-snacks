package chapterTwo;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private String day;
    private String month;
    private int year;
    private double height;
    private double weight;
    private int age;
    private int maximumHeartRate;
    private int targetHeartRate;
    private double bMI;


    public HealthProfile(String firstName,String lastName, String gender, String day, String month, int year, double height, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setDay(String day){
        this.day = day;
    }
    public void setMonth(String month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public String getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return this.age = 2022-year;
    }
    public int getMaximumHeartRate(){
        return this.maximumHeartRate= 220 - age;
    }
    public int getTargetHeartRate(){
        return this.targetHeartRate = (maximumHeartRate) * 50/100;
    }
    public double getBMI(){
        return this.bMI= weight  / (height * height);
    }
}
