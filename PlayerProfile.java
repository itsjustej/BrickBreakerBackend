package edu.ncat.brickbreakerbackend;
import java.util.ArrayList;

    public class PlayerProfile {
        private String name;
        private int numGamesPlayed;
        private int highScore;
        private ArrayList<String> savedGames;

        public PlayerProfile(){
            this.name = null;
            this.numGamesPlayed = 0;
            this.highScore = 0;
            this.savedGames = new ArrayList<>();
        }

        public PlayerProfile(String name){
            setName(name);
            this.numGamesPlayed = 0; // Initialize other fields
            this.highScore = 0;
            this.savedGames = new ArrayList<>();
        }

        public int getNumSavedGames(){
            return this.savedGames.size();
        }

        public String getSavedGame(int index){
            return this.savedGames.get(index);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumGamesPlayed() {
            return numGamesPlayed;
        }

        public void setNumGamesPlayed(int numGamesPlayed) {
            this.numGamesPlayed = numGamesPlayed;
        }

        public int getHighScore() {
            return highScore;
        }

        public void setHighScore(int highScore) {
            this.highScore = highScore;
        }

        public int getNumberOfSavedGames(){return savedGames.size();}

        public String getSavedGameName(int index){return savedGames.get(index);}

        public void setSavedGame(int index, String name){this.savedGames.set(index, name);}

        public void addSavedGame(String savedGame){this.savedGames.add(savedGame);}

        public String deleteSavedGame(int index){return savedGames.remove(index);}



        public String toString(){
            String toString =
                    this.name + "\n" +
                            this.numGamesPlayed + "\n" +
                            this.highScore + "\n";
            //savedGames.size() + "\n";

            for(int i = 0; i < savedGames.size(); i++){
                toString += savedGames.get(i) + "\n";
            }
            return toString;
        }
    }
