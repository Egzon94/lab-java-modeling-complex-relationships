package com.example.demo;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;

import java.time.LocalDate;
import java.util.List;

@Enabled
public class Exposition extends Event {

    public Exposition(Long id, LocalDate date, int duration, String location, String title, List<Guest> guests) {
        super(id, date, duration, location, title, guests);
    }
}


