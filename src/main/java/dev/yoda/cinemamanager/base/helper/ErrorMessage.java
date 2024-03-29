package dev.yoda.cinemamanager.base.helper;

import org.springframework.stereotype.Component;

@Component
public class ErrorMessage {

    private final String userAlreadyExists = "The user already exists!";
    private final String internalError = "Something is wrong!";
    private final String notFound = "Not found!";

    public String getUserAlreadyExists() {
        return userAlreadyExists;
    }

    public String getInternalError() {
        return internalError;
    }

    public String getNotFound() {
        return notFound;
    }

}
