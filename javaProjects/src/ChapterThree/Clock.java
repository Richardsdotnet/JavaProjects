package ChapterThree;


import java.util.Scanner;

public class Clock {
    private int hour;
    private int minute;
    private int second;
    public int displayTime;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        if (hour > 23) {
            hour = 0;
        }
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;


    }
    public int getMinute() {
        if (minute > 59) {
            minute = 0;
        }
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;

        }


    public int getSecond() {
        if (second > 59) {
            second = 0;
        }
        return second;
    }

    public void setSecond(int second) {
        this.second = second;

    }

    public int timeDisplay(){
        return displayTime;
    }
}