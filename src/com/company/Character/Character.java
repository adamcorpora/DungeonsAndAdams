package com.company.Character;
import java.util.Random;

public class Character {
    int strength;
    int dexterity;
    int constitution;
    int wisdom;
    int intelligence;
    int charisma;
    Weapon emptyhand;
    int sum;

    public Character() {
        this.strength = (Roll(3,18));
        this.dexterity = (Roll(3,18));
        this.constitution = (Roll(3,18));
        this.wisdom = (Roll(3,18));
        this.intelligence = (Roll(3,18));
        this.charisma = (Roll(3,18));
        System.out.println("A character named Adam created with:");
        System.out.println(strength + " Strength");
        System.out.println(dexterity + " Dexterity");
        System.out.println(constitution + " Constitution");
        System.out.println(wisdom + " Wisdom");
        System.out.println(intelligence + " Intelligence");
        System.out.println(charisma + " Charisma");
        }

    private static int Roll (int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }

    public int attack() {
        this.sum = strength + emptyhand.damage;
        System.out.println("\n" + "Adam strikes! It does " + sum + " total damage. ( " + emptyhand.dice1 + "(d8) + "
                + emptyhand.dice2 + "(d8) + " + emptyhand.dice3 + "(d8) + " + strength + "(from Strength) )");
        return 0;
    }


    public void equip(Weapon foundweapon) {
        this.emptyhand = foundweapon;
        System.out.println("\n" + "Adam equipped the " + emptyhand.type + "! It does 3d8 + Strength damage!");
    }
}