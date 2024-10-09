package edu.ncat.brickbreakerbackend;

import java.util.ArrayList;

public class GameProfiles {

        private PlayerProfile selectedProfile;
        private PlayerProfile highGameProfile;
        private ArrayList<PlayerProfile> profiles;
        private String profileFileName;


        public GameProfiles(){
            setSelectedProfile(null);
            setHighGameProfile(null);
            setProfileName(null);
            this.profiles = new ArrayList<>();
        }




        public PlayerProfile getSelectedProfile() {return this.selectedProfile;}


        public void setSelectedProfile(PlayerProfile selectedProfile) {this.selectedProfile = selectedProfile;}


        public PlayerProfile getHighGameProfile() {return this.highGameProfile;}


        public void setHighGameProfile(PlayerProfile highGameProfile) {this.highGameProfile = highGameProfile;}


        public void setProfileName(String fName) {this.profileFileName = fName;}


        public int getNumberOfProfiles(){return profiles.size();}


        public PlayerProfile getProfileName(int index){return profiles.get(index);}


        public void setProfile(int index, PlayerProfile profile){this.profiles.set(index, profile);}


        public void addProfile(PlayerProfile profile){this.profiles.add(profile);}


        public PlayerProfile deleteProfile(int index){return profiles.remove(index);}


        public String toString(){
            String toString = "";


            for(int i = 0; i < profiles.size(); i++) {
                toString += profiles.get(i) + "\n";
            }


            return toString;
        }


    }

}
