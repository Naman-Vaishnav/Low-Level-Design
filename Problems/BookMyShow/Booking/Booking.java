package Problems.BookMyShow.Booking;

import java.util.List;

import Problems.BookMyShow.Show;
import Problems.BookMyShow.Theater;
import Problems.BookMyShow.User;
import Problems.BookMyShow.Seat.Seat;

public class Booking {
    private String id;
    private User user;
    private Show show;
    private BookingStatus bookingStatus;
    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
    private List<Seat> listOfSeats;
    private int totalPrice;
    public Booking(String id, User user, Show show, BookingStatus bookingStatus, List<Seat> listOfSeats,
            int totalPrice) {
        this.id = id;
        this.user = user;
        this.show = show;
        this.bookingStatus = bookingStatus;
        this.listOfSeats = listOfSeats;
        this.totalPrice = totalPrice;
    }
    public String getId() {
        return id;
    }
    public User getUser() {
        return user;
    }
    public Show getShow() {
        return show;
    }
    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
    public List<Seat> getListOfSeats() {
        return listOfSeats;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    
}
