
class Player extends Fighter {
    public Player(String name, int health, int power) {
        super(name, health, power);
    }

    public void specialAttack(Fighter opponent) {
        int damage = 2 * power;
        opponent.takeDamage(damage);
        System.out.println(getName() + " uses a special attack on " + opponent.getName() + " for " + damage + " damage!");
    }
}
