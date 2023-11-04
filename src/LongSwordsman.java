public class LongSwordsman {
    public static int maxHealth = 60;
    public static int attack = 90;
    public static int speed = 90;
    public int currentHealth;
    public int experience;

    public LongSwordsman(int experience) {
        this.currentHealth = maxHealth;
        this.experience = experience;
    }

    public static int getMaxHealth() {
        return maxHealth;
    }

    public static void setMaxHealth(int maxHealth) {
        LongSwordsman.maxHealth = maxHealth;
    }

    public static int getAttack() {
        return attack;
    }

    public static void setAttack(int attack) {
        LongSwordsman.attack = attack;
    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        LongSwordsman.speed = speed;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        if (currentHealth <= 0) {
            this.currentHealth = 0;
            System.out.println("The soldier is dead! ");
        }else{
            this.currentHealth = currentHealth;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void move(int x, int y) {
        System.out.println("The Long Swordsman move to coordinates x = " + x + " y = " + y);

    }

    public void attack(LongSwordsman enemy) {
        setCurrentHealth(getCurrentHealth() - LongSwordsman.attack);
        enemy.setCurrentHealth(enemy.getCurrentHealth() - LongSwordsman.attack);
        experience++;
        System.out.println("The Long Swordsman attack to " + enemy + " and after battle currentHealth is " + currentHealth + " and experience " + experience + ".");
    }

    @Override
    public String toString() {
        return "LongSwordsman{" +
                "currentHealth=" + currentHealth +
                ", experience=" + experience +
                '}';
    }
}
