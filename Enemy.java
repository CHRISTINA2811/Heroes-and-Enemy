package OnceUponInTime;

public class Enemy implements Mortal {
    int health;
    @Override
    public boolean isAlive() {
        return health > 0;
    }




    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            health = health - damage;
        }


    }

}