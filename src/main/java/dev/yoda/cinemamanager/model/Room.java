package dev.yoda.cinemamanager.model;

import jakarta.persistence.*;

import java.time.Instant;

// @Entity
public class Room extends BaseEntity {

    private String name;

    public Room(String name) {
        this.name = name;
    }

}
