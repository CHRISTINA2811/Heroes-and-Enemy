package OnceUponInTime;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
       Hero archer = new Archer("Robin Good");
       archer.attackEnemy(enemy,30);
       Hero mage = new Mage("Rumpel ");
       mage.attackEnemy(enemy,15);
       Hero warrior = new Warrior("Gerkules");
       warrior.attackEnemy(enemy,10);
        System.out.println("Здоровье врага после атак: " + enemy.getHealth());

    }

}
