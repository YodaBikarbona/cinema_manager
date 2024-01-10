package dev.yoda.cinemamanager.ticket.model;

import dev.yoda.cinemamanager.base.model.BaseEntity;
import dev.yoda.cinemamanager.showtime.model.Showtime;
import dev.yoda.cinemamanager.user.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private Showtime showtime;

    public Ticket(User user, Showtime showtime) {
        this.user = user;
        this.showtime = showtime;
    }

}
