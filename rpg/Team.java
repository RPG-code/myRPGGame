package rpg;

import java.util.ArrayList;

import static rpg.RPGconstants.*;

class Team{
    private ArrayList<Character> players;
    Team(){
        players = new ArrayList<>();
        for(int i = 0;i < NUM_PLAYERS;i++){
            System.out.print("Please create player " + (i + 1) + "\n");
            players.add(new Character());
        }
    }

    void printTeamInfo(){
        for(int i = 0;i < NUM_PLAYERS;i++){
            players.get(i).printInfo();
            System.out.println("");
        }
    }
}