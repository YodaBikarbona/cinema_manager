CREATE TABLE showtime (

     id BIGSERIAL UNIQUE NOT NULL PRIMARY KEY,
     created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     price FLOAT,
     movie_id BIGINT NOT NULL,
     room_id BIGINT NOT NULL,

     CONSTRAINT fk_showtime_movie FOREIGN KEY (movie_id) REFERENCES movie(id),
     CONSTRAINT fk_showtime_room FOREIGN KEY (room_id) REFERENCES room(id)

)
