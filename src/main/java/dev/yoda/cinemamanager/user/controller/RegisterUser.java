package dev.yoda.cinemamanager.user.controller;

import dev.yoda.cinemamanager.base.helper.ErrorMessage;
import dev.yoda.cinemamanager.user.model.UserType;
import dev.yoda.cinemamanager.user.service.UserService;
import dev.yoda.cinemamanager.user.validation.RegisterRequest;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1/register")
public class RegisterUser {

    private final UserService service;
    private final PasswordEncoder passwordEncoder;
    private final ErrorMessage errorMessage;

    public RegisterUser(UserService service, PasswordEncoder passwordEncoder, ErrorMessage errorMessage) {
        this.service = service;
        this.passwordEncoder = passwordEncoder;
        this.errorMessage = errorMessage;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void register(@Validated @RequestBody RegisterRequest registerRequest) {

        String email = registerRequest.getEmail();
        String password = registerRequest.getPassword();

        if (service.getUserByEmail(email) != null) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, errorMessage.getUserAlreadyExists());
        }

        String encodedPassword = passwordEncoder.encode(password);
        registerRequest.setPassword(encodedPassword);

        if (!service.createUser(registerRequest, UserType.REGULAR)) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, errorMessage.getInternalError());
        }

    }

}
