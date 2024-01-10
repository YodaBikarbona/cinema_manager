package dev.yoda.cinemamanager.movie.model;

import dev.yoda.cinemamanager.base.model.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie extends BaseEntity {

    private String name;
    @Enumerated(EnumType.STRING)
    private MovieGenre genre;

    public Movie(String name, MovieGenre genre) {
        this.name = name;
        this.genre = genre;
    }

}
