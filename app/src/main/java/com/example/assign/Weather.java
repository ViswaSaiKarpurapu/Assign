package com.example.assign;
import com.google.gson.annotations.SerializedName;

public class Weather<Public> {
    @SerializedName("code")
    private int code;
    private String day;
    private String night;
    private int icon;


    public Weather(int code, String day, String night, int icon) {
        this.code = code;
        this.day = day;
        this.night = night;
        this.icon = icon;
    }

    public int getCode() {
        return code;
    }

    public String getDay() {
        return day;
    }

    public String getNight() {
        return night;
    }

    public int getIcon() {
        return icon;
    }



}
