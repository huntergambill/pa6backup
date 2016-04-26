
public class Update implements Comparable<Update> {
    String recordType;
    String actionCode;
    int boxID;
    int movieID;
    String movieTitle;
    String movieGenre;
    int releaseYear;
    int totalRentals;
    int rentals30;
    String fileName;
    int fileDate;
    int numberofrecords;
    int sumrentals;
    public int getSumrentals() {
        return sumrentals;
    }

    public void setSumrentals(int sumrentals) {
        this.sumrentals = sumrentals;
    }

    public int getNumberofrecords() {
        return numberofrecords;
    }

    public void setNumberofrecords(int numberofrecords) {
        this.numberofrecords = numberofrecords;
    }


    public int getFileDate() {
        return fileDate;
    }

    public void setFileDate(int fileDate) {
        this.fileDate = fileDate;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }



    public int getRentals30() {
        return rentals30;
    }

    public void setRentals30(int rentals30) {
        this.rentals30 = rentals30;
    }

    public int getTotalRentals() {
        return totalRentals;
    }

    public void setTotalRentals(int totalRentals) {
        this.totalRentals = totalRentals;
    }


    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    boolean inStock;

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
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


    @Override
    public int compareTo(Update o) {
        return (movieID-o.movieID);
    }


}
