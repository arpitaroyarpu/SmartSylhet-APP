package com.example.smartsylhet;

public class Guide {

    private String number;
    private String day;
    private String time;

    public Guide()
    {

    }

    public Guide(String number, String day, String time) {
        this.number = number;
        this.day = day;
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

