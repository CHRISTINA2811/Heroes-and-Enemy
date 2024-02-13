package OnceUponInTime;

public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy,int damage) {
        System.out.println(getName() + "стреляет из лука и попадает во врага");
        enemy.takeDamage(damage);

    }
}
