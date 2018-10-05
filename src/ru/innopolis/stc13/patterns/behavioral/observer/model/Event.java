package ru.innopolis.stc13.patterns.behavioral.observer.model;

public class Event {

    private String dateTime;
    private String place;

    public Event(String dateTime, String place) {
        this.dateTime = dateTime;
        this.place = place;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Event{" +
                "dateTime='" + dateTime + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
