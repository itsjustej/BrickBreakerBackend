//package edu.ncat.brickbreakerbackend;
import javafx.scene.paint.Color;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;


public class BrickBreakerIO {

        public static Level[] readConfigFile(String q2cFileName){
            try {
                Scanner reader = new Scanner(new File(cFileName));// take in how many levels we are making
                Level[] levels = new Level[reader.nextInt()]; ; // create a new level array that holds the number of level


                for (int i = 0; i < levels.length; i++) { // for each level
                    int levelNum = reader.nextInt(); // get which level we are on
                    int bRowLength = reader.nextInt(); // and the length of the row
                    Level l = new Level(levelNum, bRowLength); // create an object for each one


                    for (int j = 0; j < bRowLength; j++) { // for every index in the brick row array
                        int bRowNum = reader.nextInt(); // which brick row number are we on
                        Color color = Color.rgb(reader.nextInt(), reader.nextInt(), reader.nextInt()); // the color of the brick
                        int pVal = reader.nextInt(); // how many points its worth
                        String bMask = reader.next();
                        BrickRow brick = new BrickRow(pVal, color, bMask);
                        l.setBrickRow(bRowNum, brick);
                    }
                    levels[i] = l;
                }
                return levels;
            }
            catch (FileNotFoundException e) {
                System.err.println("Error " + e);
                System.exit(-1);
                return null;
            }
        }




        public static void readProfiles(GameProfiles gmProf, String cFileName){
            try {
                Scanner reader = new Scanner(new File(cFileName)); // file reader
                while (reader.hasNextLine()) {  // while loop that keeps reading until nothing left
                    String name = reader.nextLine();
                    int gamesPlayed = reader.nextInt();
                    int highGame = reader.nextInt();
                    int numSavedFiles = reader.nextInt();
                    reader.nextLine();


                    PlayerProfile p = new PlayerProfile(name);
                    p.setNumGamesPlayed(gamesPlayed);
                    p.setHighScore(highGame);
                    //for (int i = 0; i < numSavedFiles; i++) {
                      //  String savedGame = reader.nextLine();
                        //p.addSavedGame(reader.nextLine());
                    //}
                    gmProf.addPlayerProfile(p);
                }
            }
            catch (FileNotFoundException e) {
                System.err.println("Error " + e);
                System.exit(-1);
            }
        }


        public static void writeProfiles(GameProfiles gmProf, String pFileName) {
            try {
                // Open the file for writing using PrintWriter
                PrintWriter writer = new PrintWriter(pFileName);


                // Loop through each profile in the GameProfiles object
                for (int i = 0; i < gmProf.getNumPlayerProfiles(); i++) {
                    PlayerProfile p = gmProf.getPlayerProfile(i);


                    // Write the player's name
                    writer.println(p.getName());


                    // Write number of games played, high score, and number of saved files
                    writer.println(p.getNumGamesPlayed());
                    writer.println(p.getHighScore());
                    writer.println(p.getNumSavedGames());


                    // Loop through each saved game and write it
                    for (int j = 0; j < p.getNumSavedGames(); j++) {
                        writer.println(p.getSavedGame(j));
                    }
                }


                // Close the writer
                writer.close();
            }
            catch (java.io.FileNotFoundException e) {
                System.err.println("Error: " + e);
                System.exit(-1);
            }
        }
    }




}
