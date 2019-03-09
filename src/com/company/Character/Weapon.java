package com.company.Character;

 import java.util.Arrays;
 import java.util.List;

public class Weapon {
    int damage;
    String type;
    int dice1 = (int) (Math.random() * 7 + 1);
    int dice2 = (int) (Math.random() * 7 + 1);
    int dice3 = (int) (Math.random() * 7 + 1);

    List<String> weaponList = Arrays.asList("Sword of Sexiness", "Club", "Spear", "Dagger");
    int we = (int) (Math.random() * weaponList.size());

    public Weapon () {
        this.type = weaponList.get(we);
        this.damage = dice1 + dice2 + dice3;

    }
    }