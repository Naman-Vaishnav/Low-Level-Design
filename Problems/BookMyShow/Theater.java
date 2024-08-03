package Problems.BookMyShow;

import java.util.List;

public class Theater {
    private String id;
    private String name;
    private String location;
    private List<Show> listOfShows;

    public Theater(String id, String name, String location, List<Show> listOfShows) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.listOfShows = listOfShows;
    }
    
}
