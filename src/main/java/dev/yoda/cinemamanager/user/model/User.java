package dev.yoda.cinemamanager.user.model;

import dev.yoda.cinemamanager.base.model.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserType type;

    public User(String email, String password, UserType type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

}
