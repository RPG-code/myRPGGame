package rpg;

public class Game {
	public static void main(String[] args){
		new Game();
	}
	
	
	Team team;
	
	//the whole game program is run from here
	Game(){
		FileRead.readAllData();
		team = new Team();
		team.printTeamInfo();
	}


}