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
    DiceRoll go = new DiceRoll(3,6);


    List<String> nameList = Arrays.asList("Adam", "Ben", "Meech", "Natalie", "Gwen", "Ellie", "Nathan", "Heather");
    int na = (int) (Math.random() * nameList.size());

    public Character() {
        this.strength = go.roll();
        this.dexterity = go.roll();
        this.constitution = go.roll();
        this.wisdom = go.roll();
        this.intelligence = go.roll();
        this.charisma = go.roll();
        System.out.println("\n" + "A character named " + nameList.get(na) + " created with:");
        System.out.println(strength + " Strength");
        System.out.println(dexterity + " Dexterity");
        System.out.println(constitution + " Constitution");
        System.out.println(wisdom + " Wisdom");
        System.out.println(intelligence + " Intelligence");
        System.out.println(charisma + " Charisma");
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