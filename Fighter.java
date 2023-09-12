class Fighter {
    private String name;
    protected int health;
    protected int power;

    public Fighter(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public void attack(Fighter opponent) {
        int damage = (int) (Math.random() * power + 1);
        opponent.takeDamage(damage);
        System.out.println(name + " attacks " + opponent.name + " for " + damage + " damage.");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return 0;
    }
}
