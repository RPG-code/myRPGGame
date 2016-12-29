public class Game{
    Team team;
    public Game(){
        team = new Team();
    }

    public static void main(){
        Game game = new Game();
        game.team.printTeamInfo();
    }
}
