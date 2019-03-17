package com.company.Character;

public class Weapon {
    int numRolls;
    int diceUsed;
    String element;
    String type = "";

    public Weapon(int damage, String type) {
        this.diceUsed = damage;
        this.type = type;
    }

}