package dev.yoda.cinemamanager.model;

import jakarta.persistence.*;

import java.time.Instant;

// @Entity
public class Movie extends BaseEntity {

    private String name;
    @Enumerated(EnumType.STRING)
    private MovieGenre genre;

    public Movie(String name, MovieGenre genre) {
        this.name = name;
        this.genre = genre;
    }

}
