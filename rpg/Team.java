import java.util.ArrayList;
import java.util.Scanner;
public class Team{
    private ArrayList<Character> players;
    public Team(){
        players = new ArrayList<>();
        for(int i = 0;i < 4;i++){
            System.out.print("Please create player " + (i + 1) + "\n");
            players.add(new Character());
        }
    }

    public void printTeamInfo(){
        for(int i = 0;i < 4;i++){
            players.get(i).printInfo();
            System.out.println("");
        }
    }
}
