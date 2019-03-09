package com.company.Character;

public class Weapon {
    int damage;
    String type;
    int dice1 = (int) (Math.random() * 7 + 1);
    int dice2 = (int) (Math.random() * 7 + 1);
    int dice3 = (int) (Math.random() * 7 + 1);

    public Weapon () {
        this.damage = dice1 + dice2 + dice3;
        this.type = "Mace";
    }
    }