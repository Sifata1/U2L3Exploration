public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();

        game.addPlayer();
        game.addPlayer();
        System.out.println("There are " + game.getPlayers() + " players!");
        System.out.println();

        game.increaseScore(10);
        game.increaseScore(15);
        game.addPlayer();
        game.increaseScore(25);

        System.out.println("<------------------------------>");
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Total Score: " + game.getScore());
        System.out.println("Average Score Per Player: " + game.averageScorePerPlayer());
        System.out.println("<------------------------------>");


    }
}
