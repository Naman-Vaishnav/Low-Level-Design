package Problems.BookMyShow;

import java.time.LocalDateTime;
import java.util.Map;

import Problems.BookMyShow.Seat.Seat;

public class Show {
    private String id;
    private Movie movie;
    private Theater theater;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Map<String,Seat> listOfSeats;

    public Show(String id, Movie movie, Theater theater, LocalDateTime startTime, LocalDateTime endTime,
            Map<String, Seat> listOfSeats) {
        this.id = id;
        this.movie = movie;
        this.theater = theater;
        this.startTime = startTime;
        this.endTime = endTime;
        this.listOfSeats = listOfSeats;
    }

    public String getId() {
        return id;
    }

    public Map<String,Seat> getSeats() {
        return listOfSeats;
    }

    

}
