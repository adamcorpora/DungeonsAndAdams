package com.company.Character;
import java.util.Arrays;
import java.util.List;

public class Character {
    int strength;
    int dexterity;
    int constitution;
    int wisdom;
    int intelligence;
    int charisma;
    Weapon emptyhand;
    int sum;

    List<String> nameList = Arrays.asList("Adam", "Ben", "Meech", "Natalie");
    int na = (int) (Math.random() * nameList.size());

    public Character(Weapon type) {
        this.strength = (Roll(3,18));
        this.dexterity = (Roll(3,18));
        this.constitution = (Roll(3,18));
        this.wisdom = (Roll(3,18));
        this.intelligence = (Roll(3,18));
        this.charisma = (Roll(3,18));
        System.out.println("A character named " + nameList.get(na) + " created with:");
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
        System.out.println("\n" + nameList.get(na) + " strikes! It does " + sum + " total damage. ( " + emptyhand.dice1 + "(d8) + "
                + emptyhand.dice2 + "(d8) + " + emptyhand.dice3 + "(d8) + " + strength + "(from Strength) )");
        return 0;
    }


    public void equip(Weapon foundweapon) {
        this.emptyhand = foundweapon;
        System.out.println("\n" + nameList.get(na) + " equipped the " + emptyhand.type + "! It does 3d8 + Strength damage!");
    }
}