package com.company.Character;

public class Adventure {
    public static void main(String[] args) {
        Character Adam = new Character(new Weapon ("ax"));
        Character Jeff = new Character(new Weapon("Flail"));
        Weapon selectedweapon = new Weapon("sword");

        Jeff.equip(selectedweapon);

        System.out.println(Jeff.attack());

    }

}
