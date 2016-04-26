import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class UpdateFile {
    public static void main (String[] args) throws FileNotFoundException {
//Update file format
        //H#titletownvideomartupdates#04-13-16#
        //D#A#1234#9987#Rocky 72#Drama#2018#true#23#29
        //D#D#etc…
        //D#C#etc…
       // T#titletownvideomartupdates#04/13/2016#5#30
       // For update layers, read in files to master array and compare, sort by box id and movie id

        //read in update file
        File updateFile = new File("update.txt");
        Scanner scanner2 = new Scanner(updateFile);

        //create three arrays to hold file data
        Update[] updateArray = new Update [200];
        Update[] masterArray = new Update[200];
        Update[] newMasterArray = new Update[200];

        //three counters for the arrays
        int updateCounter = 0;
        int masterCounter = 0;
        int newMasterCounter = 0;

        //create ArrayList of Movies from update file
        ArrayList<Update> updateMovies = new ArrayList<Update>();
        //read through each line,splitting and setting each field
        while (scanner2.hasNextLine()) {
            Update obj = new Update ();
            String line = scanner2.nextLine();
            String[] category = line.split("#");
            while(category[0]==("H")){
            obj.setFileName(category[1]);
            obj.setFileDate(Integer.parseInt(category[2]));
            }
            while(category[0]==("D")) {
                while(category[1]=="A") {
                    updateCounter++;
                    newMasterCounter++;

/*
                    obj.setBoxID(Integer.parseInt(category[2]));
                    obj.setMovieID(Integer.parseInt(category[3]));
                    obj.setMovieGenre(category[4]);
                    obj.setReleaseYear(Integer.parseInt(category[5]));
                    obj.setInStock(Boolean.parseBoolean(category[6]));
                    obj.setTotalRentals(Integer.parseInt(category[7]));
                    obj.setRentals30(Integer.parseInt(category[8]));
*//
                }
                while(category[1]=="C") {
                    updateCounter++;
                    masterCounter++;
                    newMasterCounter++;


                }
                while(category[1]=="D") {
                    updateCounter++;
                    masterCounter++;

                }

            while(category[0]=="T") {
                obj.setFileName(category[1]);
                obj.setFileDate(Integer.parseInt(category[2]));
                obj.setNumberofrecords(Integer.parseInt(category[3]));
                obj.setTotalRentals(Integer.parseInt(category[4]));

            }
            obj.setActionCode(category[1]);
            obj.setBoxID(Integer.parseInt(category[2]));
            obj.setMovieID(Integer.parseInt(category[3]));
            obj.setMovieGenre(category[4]);
            obj.(category);


            }
            obj.setBoxID(Integer.parseInt(category[0]));
            obj.setMovieID(Integer.parseInt(category[1]));
            obj.setMovieTitle((category[2]));
            obj.setMovieGenre((category[3]));
            obj.setReleaseYear(Integer.parseInt(category[4]));
            obj.setInStock(Boolean.parseBoolean(category[5]));
            obj.setTotalRentals(Integer.parseInt(category[6]));
            obj.setRentals30(Integer.parseInt(category[7]));
            updateMovies.add(obj);
        }
        //read in master file
        File masterFile = new File("master.txt");
        Scanner scanner = new Scanner(masterFile);
        //create ArrayList of movies from master file
        ArrayList<Master> masterMovies = new ArrayList<Master>();
        //read through each line,splitting and setting each field
        while (scanner.hasNextLine()) {
            Master obj = new Master ();
            String line2 = scanner.nextLine();
            String[] category = line2.split("#");
            obj.setBoxID(Integer.parseInt(category[0]));
            obj.setMovieID(Integer.parseInt(category[1]));
            obj.setMovieTitle((category[2]));
            obj.setMovieGenre((category[3]));
            obj.setReleaseYear(Integer.parseInt(category[4]));
            obj.setInStock(Boolean.parseBoolean(category[5]));
            obj.setTotalRentals(Integer.parseInt(category[6]));
            obj.setRentals30(Integer.parseInt(category[7]));
            masterMovies.add(obj);


        }
        //sort and .compare
        Collections.sort(masterMovies);
        Collections.sort(updateMovies);

        while (notatBottom(updateCounter, masterCounter)) {
        if (updateArray[updateCounter].getMovieID() < masterArray[masterCounter].getMovieID()) {
        newMasterArray[newMasterCounter] = updateArray[updateCounter];
        updateCounter++;
        newMasterCounter++;
        }
        if (updateArray[updateCounter].getMovieID() > masterArray[masterCounter].getMovieID()) {
        newMasterArray[newMasterCounter] = masterArray[masterCounter];
        masterCounter++;
        newMasterCounter++;
        }

        if ("C" == updateArray[updateCounter].getActionCode()) {
        newMasterArray[newMasterCounter] = updateArray[updateCounter];
        updateCounter++;
        newMasterCounter++;
        masterCounter++;
        } else // delete
        updateCounter++;
        masterCounter++;
        PrintWriter outputFile = new PrintWriter("master.txt");
        //for (){
        outputFile.println();
        outputFile.close();
    }
    }}

    private static boolean notatBottom(int updateCounter, int masterCounter) {
        if (updateCounter = 0) return true;
        else {
            return false;}
 /*/while (notatBottom(updateCounter, masterCounter)) {
                    //if (updateArray[updateCounter].getlastName() < masterArray[masterCounter].getlastName()) {
                    newMasterArray[newMasterCounter] = updateArray[updateCounter];
                    updateCounter++;
                    newMasterCounter++;
                    //}
                    //if (updateArray[updateCounter].getlastName() > masterArray[masterCounter].getlastName()) {
                    newMasterArray[newMasterCounter] = masterArray[masterCounter];
                    masterCounter++;
                    newMasterCounter++;
                    //}

                    //if (C = updateArray[updateCounter].getActionCode()) {
                    //newMasterArray[newMasterCounter] = updateArray[updateCounter];
                    //updateCounter++;
                    //newMasterCounter++;
                    //masterCounter++;
                    //} else // delete
                    updateCounter++;
                    masterCounter++;

    }

}
