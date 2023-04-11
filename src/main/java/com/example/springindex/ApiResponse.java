package com.example.springindex;
import java.util.List;

public class ApiResponse {

    private List<Event> events;

    // Getters and setters

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}