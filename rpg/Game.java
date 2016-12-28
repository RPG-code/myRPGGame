package rpg;

public class Game {
	public static void main(String[] args){
		new Game();
		//Game game = new Game();
		//game.team.printTeamInfo(); //move to constructor
	}
	
	
	Team team;
	
	//the whole game program is run from here
	Game(){
		team = new Team();
		team.printTeamInfo();
	}


}