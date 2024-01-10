//package dev.yoda.cinemamanager.service;
//
//import dev.yoda.cinemamanager.showtime.model.Showtime;
//import dev.yoda.cinemamanager.repository.ShowtimeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ShowtimeService {
//
//    private ShowtimeRepository showtimeRepository;
//
//    @Autowired
//    public ShowtimeService(ShowtimeRepository userRepository) {
//        this.showtimeRepository = userRepository;
//    }
//
//    public List<Showtime> getAllShowtimes() {
//        return showtimeRepository.findAll();
//    }
//
//    public Showtime getShowtimeById(long id) { return showtimeRepository.findById(id); }
//
//}
