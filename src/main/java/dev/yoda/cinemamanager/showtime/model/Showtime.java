package dev.yoda.cinemamanager.showtime.model;

import dev.yoda.cinemamanager.base.model.BaseEntity;
import dev.yoda.cinemamanager.movie.model.Movie;
import dev.yoda.cinemamanager.room.model.Room;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "showtime")
public class Showtime extends BaseEntity {

    private Float price;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public Showtime(Movie movie, Room room, Float price) {
        this.movie = movie;
        this.room = room;
        this.price = price;
    }

}
