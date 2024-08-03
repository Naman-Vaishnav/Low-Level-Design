package Problems.BookMyShow.Seat;

public class Seat {
    private String id;
    private String row;
    private String col;
    private SeatStatus seatStatus;
    private SeatType seatType;
    private int price;

    public Seat(String id, String row, String col, SeatStatus seatStatus, SeatType seatType, int price) {
        this.id = id;
        this.row = row;
        this.col = col;
        this.seatStatus = seatStatus;
        this.seatType = seatType;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getRow() {
        return row;
    }

    public String getCol() {
        return col;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public int getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
