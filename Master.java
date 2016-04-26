import java.util.Comparator;

public class Master implements Comparable<Master> {
    int boxID;
    int movieID;
    String movieTitle;
    String movieGenre;
    int releaseYear;
    boolean inStock;
    int totalRentals;
    int rentals30;

    public int getTotalRentals() {
        return totalRentals;
    }

    public void setTotalRentals(int totalRentals) {
        this.totalRentals = totalRentals;
    }



    public int getRentals30() {
        return rentals30;
    }

    public void setRentals30(int rentals30) {
        this.rentals30 = rentals30;
    }

    public int getBoxID() {
        return boxID;
    }

    public void setBoxID(int boxID) {
        this.boxID = boxID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }


    @Override
    public int compareTo(Master o) {
        return (movieID-o.movieID);
    }
}
