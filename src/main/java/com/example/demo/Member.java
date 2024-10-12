package com.example.demo;


import ch.qos.logback.core.status.Status;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity

public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)

    private Status status;

    private LocalDate renewalDate;

    public Member(Long id, String name, Status status, LocalDate renewalDate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }
    public enum Status {
        ACTIVE,
        LAPSED,

    }
}
