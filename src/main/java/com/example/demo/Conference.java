package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Conference extends Event{


    @OneToMany
    @JoinColumn(name = "conference_id")
    private List<Speaker> speakers;

    public Conference(Long id, LocalDate date, int duration, String location, String title, List<Guest> guests, List<Speaker> speakers) {
        super(id, date, duration, location, title, guests);
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
