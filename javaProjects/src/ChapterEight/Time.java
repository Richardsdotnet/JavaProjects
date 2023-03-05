package ChapterEight;

public class Time {

    private int second;
    private int minute;
    private int hour;


    public Time(int second, int minute, int hour){

        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public static void validate(int second, int minute, int hour){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    public Time(int hour, int minute){
        this(0, minute, hour);
    }
    public Time(int hour){
        this(hour, 0 );
    }
    public static void validateHour(int hour){

        boolean hourIsInvalid = hour < 0 || hour > 23;
        if(hourIsInvalid) throw new IllegalArgumentException("Hour should be between 0 and 23");
    }
    public static void validateMinute(int minute){
             boolean minuteIsInvalid = minute < 0 || minute > 59;
             if(minuteIsInvalid) throw new IllegalArgumentException("Minute should be between 0 and 59");

    }
    public static void validateSecond(int second){

             boolean secondIsInvalid = second < 0 || second >= 60;
             if(secondIsInvalid) throw new IllegalArgumentException("Second should be between 1 and 24");

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateMinute(hour);
        this.hour = hour;
    }
}
