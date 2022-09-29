public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer();
        game.addPlayer();
        System.out.println("There are " + game.getPlayers() + "players!");
        System.out.println("Are you ready to begin?");


    }
}
