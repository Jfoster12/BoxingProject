public class BoxingGame {
    public static void main(String[] args) {
        Fighter player1 = new Player("Player 1", 100, 10);
        Fighter player2 = new Fighter("Player 2", 120, 8);

        BoxingMatch match = new BoxingMatch(player1, player2);
      match.fight();
    }
}