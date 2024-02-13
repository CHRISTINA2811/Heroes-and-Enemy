package OnceUponInTime;

public class Mage extends Hero{

   public Mage(String name){
       super(name);
   }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        System.out.println( getName() + "произносит заклинание и наносит удар" + " ");
        enemy.takeDamage(10);


    }
}
