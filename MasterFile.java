import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MasterFile {
    public static void main (String[] args) throws FileNotFoundException {
        //read in master file
        File masterFile = new File("master.txt");
        Scanner scanner = new Scanner(masterFile);
        //create ArrayList of movies from master file
        ArrayList<Master> masterMovies = new ArrayList<Master>();
        //read through each line,splitting and setting each field
        while (scanner.hasNextLine()) {
            Master obj = new Master();
            String line2 = scanner.nextLine();
            String[] mastercategory = line2.split("#");
            obj.setBoxID(Integer.parseInt(mastercategory[0]));
            obj.setMovieID(Integer.parseInt(mastercategory[1]));
            obj.setMovieTitle((mastercategory[2]));
            obj.setMovieGenre((mastercategory[3]));
            obj.setReleaseYear(Integer.parseInt(mastercategory[4]));
            obj.setInStock(Boolean.parseBoolean(mastercategory[5]));
            obj.setTotalRentals(Integer.parseInt(mastercategory[6]));
            obj.setRentals30(Integer.parseInt(mastercategory[7]));
            masterMovies.add(obj);

            Collections.sort(masterMovies);


            // Master File format
            //1234#55678#Elf#Comedy#2003#true#5#2

        }
    }}