package dev.yoda.cinemamanager.room.model;

import dev.yoda.cinemamanager.base.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "room")
public class Room extends BaseEntity {

    private String name;

    public Room(String name) {
        this.name = name;
    }

}
