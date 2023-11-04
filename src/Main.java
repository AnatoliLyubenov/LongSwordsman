public class Main {


    public static void main(String[] args) {
        // Да се напише клас за войник от компютърна игра - Long Swordsman.
        // Класът имат статични полета maxHealth, attack, speed и полета: currentHealth, experience.
        // И методи move(int x, int y), attack(String enemy),
        // при който намаляме currentHealth и увеличаваме experience.
        // Да се направи масив с 3 обекта на класа Long Swordsman. (edited)
        LongSwordsman[] army = new LongSwordsman[3];
        LongSwordsman longSwordsman1 = new LongSwordsman(10);
        LongSwordsman longSwordsman2 = new LongSwordsman(45);
        LongSwordsman longSwordsman3 = new LongSwordsman(35);
        army[0] = longSwordsman1;
        army[1] = longSwordsman2;
        army[2] = longSwordsman3;
        LongSwordsman enemy = new LongSwordsman(60);

        for (int i = 0; i < army.length; i++) {
            System.out.println(" Long Swordsman " + i + " = " + army[i]);

            army[0].attack(enemy);
        }

    }
}
