
class BoxingMatch {
    private Fighter player1;
    private Fighter player2;

    public BoxingMatch(Fighter player1, Fighter player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
      int player1Health = player1.getHealth();
      int player2Health = player2.getHealth();
    
      


    public void fight() {
        while (player1.isAlive() && player2.isAlive()) {
            System.out.println(player1.getName() + " health: " + player1.health);
            System.out.println(player2.getName() + " health: " + player2.health);
            
            player1.attack(player2);
            
            if (player2.isAlive()) {
                player2.attack(player1);
            }
        }

        if (player1.isAlive()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.isAlive()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
