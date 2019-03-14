package com.company.Character;

import java.util.Arrays;
import java.util.List;

public class Weapon {
    int damage;
    String type;
    int dice1 = (int) (Math.random() * 7 + 1);
    int dice2 = (int) (Math.random() * 7 + 1);
    int dice3 = (int) (Math.random() * 7 + 1);
    int numDice;
    int dieSize;
    int dmgModifier;

    List<String> weaponList = Arrays.asList("Sword of Sexiness", "Club", "Spear", "Dagger");
    int we = (int) (Math.random() * weaponList.size());

    public Weapon() {
        this.type = "";
        this.numDice = 1;
        this.dieSize = 4;
    }
    public Weapon(String type, int numDice, int dieSize) {
        this.type = type;
        this.numDice = numDice;
        this.dieSize = dieSize;
//        this.type = weaponList.get(we);
//        this.damage = dice1 + dice2 + dice3;

    }
}