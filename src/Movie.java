import java.util.Arrays;

public class Movie {
    private String title;
    private double rating;
    private String[] genres;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public Movie(String title, double rating, String[] genres) {
        this.title = title;
        this.rating = rating;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public static void main(String[] args) {
        String[] movieGenres = {"Action", "Adventure", "Horror"};
        Movie movie = new Movie("Suster Ngesot", 8.6, movieGenres);

        System.out.println("Title: " + movie.getTitle());
        System.out.println("Rating: " + movie.getRating());
        System.out.println("Genres: " + Arrays.toString(movie.getGenres()));

        String[] newGenres = {"Drama", "Sci-Fi"};
        movie.setGenres(newGenres);
        System.out.println("New Genres: " + Arrays.toString(movie.getGenres()));
    }
}
