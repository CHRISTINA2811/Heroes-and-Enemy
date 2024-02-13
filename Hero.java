package OnceUponInTime;

abstract class Hero {
     String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void attackEnemy(Enemy enemy, int damage){
        System.out.println(name + "атакует врага");
                enemy.takeDamage(damage);
    }

}
