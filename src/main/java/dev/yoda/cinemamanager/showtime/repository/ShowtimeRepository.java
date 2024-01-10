//package dev.yoda.cinemamanager.repository;
//
//import dev.yoda.cinemamanager.showtime.model.Showtime;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//public interface ShowtimeRepository extends JpaRepository<Showtime, Long> {
//
//    // Fetch all users
//    List<Showtime> findAll();
//    // Fetch the user by ID
//    Showtime findById(@Param("id") long id);
//
//}
