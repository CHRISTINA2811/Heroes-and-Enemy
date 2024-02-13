package OnceUponInTime;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        System.out.println (getName() + "наносит удар мечом");
        enemy.takeDamage(damage);

    }
}
