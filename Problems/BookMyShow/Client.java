package Problems.BookMyShow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Problems.BookMyShow.Booking.Booking;
import Problems.BookMyShow.Seat.Seat;
import Problems.BookMyShow.Seat.SeatStatus;
import Problems.BookMyShow.Seat.SeatType;

public class Client {
    public static void main(String[] args) {
        MovieBookingSystem movieBookingSystem=MovieBookingSystem.getInstance();

        //add movie
        Movie movie1=new Movie("M1", "Movie1", "MovieName1", 110);
        Movie movie2=new Movie("M2", "Movie2", "MovieName2", 140);
        movieBookingSystem.addMovie(movie1);
        movieBookingSystem.addMovie(movie2);

        //add theater
        Theater theater1=new Theater("T1", "Theater1", "Loc1", new ArrayList<>());
        Theater theater2=new Theater("T2", "Theater2", "Loc2", new ArrayList<>());
        movieBookingSystem.addTheater(theater1);
        movieBookingSystem.addTheater(theater2);

        //add show
        Show show1=new Show("S1", movie1, theater2, LocalDateTime.now(), LocalDateTime.now().plusMinutes(movie1.getDurationInMinutes()), createSeats(10,10));
        movieBookingSystem.addShow(show1);

        //create booking
        User user1=new User("u1", "user1", "email1");
        List<Seat> selectedSeats=Arrays.asList(show1.getSeats().get("1-5"),show1.getSeats().get("4-6"));
       // System.out.println(createSeats(10,10));
        Booking booking=movieBookingSystem.bookTickets(user1, show1, selectedSeats);

        if(booking!=null){
            System.out.println("Booked ticket. Booking ID:"+booking.getId());
            movieBookingSystem.confirmBooking(booking.getId());
        }
        else{
            System.out.println("Booking failed. Seats not available.");
        }

        //cancel booking
        movieBookingSystem.cancelBooking(show1, booking.getId());
        System.out.println("Booking canceled. Booking ID: " + booking.getId());

    }

    static private Map<String,Seat> createSeats(int row,int col){
        Map<String,Seat> seats=new HashMap<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                String seatId=i+"-"+j;
                SeatType type=i<=2?SeatType.PREMIUM:SeatType.NORMAL;
                int price=(type==SeatType.PREMIUM)?200:100;
                Seat seat=new Seat(seatId, Integer.toString(i), Integer.toString(j), SeatStatus.AVAILABLE, type, price);
                seats.put(seatId, seat);
            }
        }

        return seats;
    }

   
}
