package chapterTwo;

public class Heartrates {
    private String firstName;
    private String lastName;
    private String day;
    private String month;
    private int year;
    private int age;
    private int maximumHeartRate;
    private int targetHeartRate;

public Heartrates(String firstName,String lastName,String day,String month,int year){
    this.firstName=firstName;
    this.lastName=lastName;
    this.day=day;
    this.month=month;
    this.year=year;
}
public void setFirstName(String firstName){
    this.firstName=firstName;
}
public String getFirstName(){
    return firstName;
}
public void setLastName(String lastName){
    this.lastName=lastName;
}
public String getLastName(){
    return lastName;
}
public void setDay(String day){
    this.day=day;
}
public String getDay(){
    return day;
}
public void setMonth(String month){
    this.month=month;
}
public String getMonth(){
    return month;
}
public void setYear(int year){
    this.year=year;
}
public int getYear(){
    return year;
}
public int getAge(){
    return this.age = 2022 - year;
}
public int maximumHeartRate(){
    return this.maximumHeartRate = 220-age;
}
public int targetHeartRate(){
    age = 2022 - year;
    maximumHeartRate=220 - age;
    return this.targetHeartRate = (220-age)*50/100;}
}
