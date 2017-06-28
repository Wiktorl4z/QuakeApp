package com.example.android.quakereport;

public class Earthquake {

    // @param magnitude earth quake magnitude
    private double magnitude;

    // @param city location of earthquake
    private String location;

    private long mTimeInMilliseconds;

    private String mUrl;

    public Earthquake(Double magnitude, String location, Long timeInMilliseconds, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mUrl = url;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }
}
