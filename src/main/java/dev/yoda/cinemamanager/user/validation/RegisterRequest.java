package dev.yoda.cinemamanager.user.validation;

import jakarta.validation.constraints.NotNull;

public class RegisterRequest {

    @NotNull(message = "Name is required")
    private String email;

    @NotNull(message = "Price is required")
    private String password;

    public RegisterRequest(String email, String password) {
        this.email = email;
        this.password = password;
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
}
