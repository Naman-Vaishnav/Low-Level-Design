1)System should allow users to view the list of movies playing in different theaters
2)User should be able to select theater,moview and show timing to book
3)select Seating arrangement
4)Different type for seat and pricing
5)Make payment and confirm booking

6)Admin can add,update and remove movie,show..

7)Concurrent booking and ensure seat availability in real-time
https://medium.com/@abhishekranjandev/concurrency-conundrum-in-booking-systems-2e53dc717e8c
https://codeminion.hashnode.dev/how-does-bookmyshow-handle-concurrent-bookings
8)Should handle large number of concurrent users and booking


MovieBookingSystem
    instance
    List<Movie>
    List<Theater>
    Map<showId,Show>
    Map<bookingId,Booking>

    -bookTickets(User,Show,List<Seats//selected>) synchronized
    -confirmTickets(Booking)

Movie
    id
    title
    name
    duration

Theater
    id
    name
    location
    List<Show>

Show
    id
    Movie
    Theater
    startTime
    endTime
    Map<String,Seat>

Seat
    id
    row
    col
    SeatType
    SeatStatus
    price

SeatType enum NORMAL,PREMIUM

SeatStatus enum AVAILABLE, BOOKED

Booking
    bookingId
    User
    Show
    BookingStatus
    List<Seats>
    totolPrice

BookingStatus PENDING,CONFIRMED,CANCELLED

User
    id
    name
    email
