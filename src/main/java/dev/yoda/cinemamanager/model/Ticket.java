package dev.yoda.cinemamanager.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Ticket extends BaseEntity {

    private User user;
    private Showtime showtime;

    public Ticket(User user, Showtime showtime) {
        this.user = user;
        this.showtime = showtime;
    }

}
