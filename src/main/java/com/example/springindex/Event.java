package com.example.springindex;
import java.util.List;

public class Event {

    private String year;
    private String description;
    private List<WikipediaLink> wikipedia;

    // Getters and setters

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<WikipediaLink> getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(List<WikipediaLink> wikipedia) {
        this.wikipedia = wikipedia;
    }
}