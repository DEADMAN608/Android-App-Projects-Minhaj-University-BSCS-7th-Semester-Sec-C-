package com.example.myapp;

public class weatherModel {

    String key;
    String q;
    String aqi;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public weatherModel(String key, String q, String aqi) {
        this.key = key;
        this.q = q;
        this.aqi = aqi;
    }
}
