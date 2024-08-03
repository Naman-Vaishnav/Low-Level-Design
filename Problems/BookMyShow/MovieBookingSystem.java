package Problems.BookMyShow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import Problems.BookMyShow.Booking.Booking;
import Problems.BookMyShow.Booking.BookingStatus;
import Problems.BookMyShow.Seat.Seat;
import Problems.BookMyShow.Seat.SeatStatus;

public class MovieBookingSystem {

    private MovieBookingSystem(){
        this.listOfBookings=new HashMap<>();
        this.listOfMovies=new ArrayList<>();
        this.listOfShows=new HashMap<>();
        this.listOfTheaters=new ArrayList<>();
    }

    private static class SingletonInstance{
        private static final MovieBookingSystem INSTANCE=new MovieBookingSystem();
    }

    public static MovieBookingSystem getInstance(){
        return SingletonInstance.INSTANCE;
    }

    private final List<Movie> listOfMovies;
    private final List<Theater> listOfTheaters;
    private final Map<String,Show> listOfShows;
    private final Map<String,Booking> listOfBookings;

    private static final String BOOKING_ID_PREFIX = "BKG";
    private static final AtomicLong bookingCounter = new AtomicLong(0);

    public void addMovie(Movie movie){
        listOfMovies.add(movie);
    }

    public void addTheater(Theater theater){
        listOfTheaters.add(theater);
    }

    public void addShow(Show show){
        listOfShows.put(show.getId(),show);
    }

    public synchronized void cancelBooking(Show show,String bookingId){
        Booking booking=listOfBookings.get(bookingId);
        if(booking!=null&&booking.getBookingStatus()!=BookingStatus.CANCELLED){
            booking.setBookingStatus(BookingStatus.CANCELLED);
            makeSeatsAvailable(show,booking.getListOfSeats());
        }
    }

    void makeSeatsAvailable(Show show,List<Seat> selectedSeats){
        for(Seat seat:selectedSeats){
           Seat showSeat=show.getSeats().get(seat.getId());
           showSeat.setSeatStatus(SeatStatus.AVAILABLE);

        }
    }


    public synchronized Booking bookTickets(User user,Show show,List<Seat> selectedSeats){
        //areSeatsAvailable
        //makeSeatsBooked
        //generateBookingId
        //new Booking
        //add to listOfBookings

        if(areSeatsAvailable(show,selectedSeats)){
            makeSeatsBooked(show,selectedSeats);
            int totalPrice=calculatePrice(selectedSeats);
            String bookingId=generateBookingId();
            Booking booking=new Booking(bookingId, user, show, BookingStatus.PENDING, selectedSeats, totalPrice);
            listOfBookings.put(bookingId, booking);
            return booking;
        }
        
        return null;
    }

    boolean areSeatsAvailable(Show show,List<Seat> selectedSeats){

        for(Seat seat:selectedSeats){
            Seat showSeat=show.getSeats().get(seat.getId());
            if(showSeat==null||showSeat.getSeatStatus()==SeatStatus.BOOKED){
                return false;
            }
        }

        return true;
    }

    void makeSeatsBooked(Show show,List<Seat> selectedSeats){
        for(Seat seat:selectedSeats){
           Seat showSeat=show.getSeats().get(seat.getId());
           showSeat.setSeatStatus(SeatStatus.BOOKED);

        }
    }

    int calculatePrice(List<Seat> selectedSeats){
        int total=0;
        for(Seat seat:selectedSeats){
            total+=seat.getPrice();
        }
        return total;
    }

    String generateBookingId(){
        long bookingNumber=bookingCounter.incrementAndGet();
        String timestamp=LocalDateTime.now().toString();
        return BOOKING_ID_PREFIX+timestamp+bookingNumber;
    }

    public void confirmBooking(String bookingId){
        Booking booking=listOfBookings.get(bookingId);
        if(booking!=null&&booking.getBookingStatus()==BookingStatus.PENDING){
            booking.setBookingStatus(BookingStatus.CONFIRMED);
        }
        
    }

}
