package chapterTwo;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;
    public Clock(int hour, int minute, int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }
    public void setHour(int hour){
        if(hour<24)this.hour = hour;
    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
        if(minute<60)this.minute = minute;
    }
    public int getMinute(){
        return minute;
    }
    public void setSeconds(int seconds){
        if(seconds<60)this.seconds = seconds;
    }
    public int getSeconds(){
        return seconds;
    }


    }

