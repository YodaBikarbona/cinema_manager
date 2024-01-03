package dev.yoda.cinemamanager.controller;

import dev.yoda.cinemamanager.helper.ErrorMessage;
import dev.yoda.cinemamanager.model.Showtime;
import dev.yoda.cinemamanager.service.ShowtimeService;
import dev.yoda.cinemamanager.service.UserService;
import dev.yoda.cinemamanager.validation.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/showtimes")
public class ShowtimeController {

    @Autowired
    private ShowtimeService service;
    @Autowired
    private ErrorMessage errorMessage;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("")
    public List<Showtime> getAllShowtimes() {

        List<Showtime> showtimes = service.getAllShowtimes();

        if (service == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, errorMessage.getNotFound());
        }

        return showtimes;

    }

}