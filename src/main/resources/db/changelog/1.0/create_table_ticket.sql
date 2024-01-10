CREATE TABLE ticket (

     id BIGSERIAL UNIQUE NOT NULL PRIMARY KEY,
     created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     user_id BIGINT NOT NULL,
     showtime_id BIGINT NOT NULL,

     CONSTRAINT fk_ticket_user FOREIGN KEY (user_id) REFERENCES "user"(id),
     CONSTRAINT fk_ticket_showtime FOREIGN KEY (showtime_id) REFERENCES showtime(id)

)
