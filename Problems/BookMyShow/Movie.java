package Problems.BookMyShow;

public class Movie {
    private String id;
    private String title;
    private String name;
    private int durationInMinutes;
    
    public Movie(String id, String title, String name, int durationInMinutes) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.durationInMinutes = durationInMinutes;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
