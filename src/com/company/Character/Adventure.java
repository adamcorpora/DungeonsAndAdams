package com.company.Character;

import com.company.Character.Spellcasters.Wizard;

public class Adventure {
    public static void main(String[] args) {
        Character Adam = new Character(12, 12, 12, 13, 14, 15);

        Character Jeff = new Character(new Weapon("Flail", 1, 6));
        Character rando = new Character();
        Weapon selectedweapon = new Weapon("sword", 1, 8);
        selectedweapon.dieSize = 4;
        selectedweapon.numDice = 2;

        Wizard carl = new Wizard();
        carl.castSpell("Magic missile");
        carl.equip(new Weapon("dog", 2, 4));
        Character.Roll(3, 14);
        Rogue bev = new Rogue();
        bev.equip(new Weapon("Sharpened Spork", 5, 12));
        bev.sneakyStabbies();

        Jeff.equip(selectedweapon);

        System.out.println(Jeff.attack());
    }

}
