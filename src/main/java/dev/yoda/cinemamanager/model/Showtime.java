package dev.yoda.cinemamanager.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Showtime extends BaseEntity {

    private Movie movie;
    private Room room;
    private Float price;

    public Showtime(Movie movie, Room room, Float price) {
        this.movie = movie;
        this.room = room;
        this.price = price;
    }

}
