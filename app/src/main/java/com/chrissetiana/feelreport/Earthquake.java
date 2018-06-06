package com.chrissetiana.feelreport;

public class Earthquake {

    public final String title;
    public final String numOfPeople;
    public final String perceivedStrength;

    public Earthquake(String eventTitle, String eventNumOfPeople, String eventPerceivedStrength) {
        title = eventTitle;
        numOfPeople = eventNumOfPeople;
        perceivedStrength = eventPerceivedStrength;
    }
}
