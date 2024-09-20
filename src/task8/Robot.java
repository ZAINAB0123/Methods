package task8;

public abstract class Robot {
   private String name;
   private int energy;
 private    int protection;
  private   int health = 100;

public Robot(String name, int energy, int protection,int health){
    this.name = name;
    this.energy= energy;
    this.protection = protection;

}

    public void defend(Robot robot) {
        int robotAttack = robot.getEnergy();
        int robotProtection = robot.getProtection();
        int myDamage = robotAttack - this.getProtection();
        int robotDamage = this.getEnergy() - robotProtection;
        robot.setHeath(robot.getHealth() - robotDamage);
         this.getHealth(this.getHealth() - myDamage);

    }
    public String getName() {
    return name;
}

public int getEnergy() {
    return energy;
}

public int getProtection() {
    return protection;
}

public int getHealth() {
    return health;
}
public  int setHeath(int healthAmount) {
    this.health = healthAmount;
    return healthAmount;
}

@Override
public String toString() {
    return "Robot{" +
            "energy=" + energy +
            ", name='" + name + '\'' +
            ", protection=" + protection +
            ", health=" + health +
            '}';
}
}
