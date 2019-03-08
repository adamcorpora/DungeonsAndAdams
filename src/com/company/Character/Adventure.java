package com.company.Character;

public class Adventure {
    public static void main(String[] args) {
        Character adam = new Character();
        Weapon sword = new Weapon();
        //He's created two objects. Object adam and Object sword.

        adam.equip(sword);
        //Object adam pulled from "Character". Run "equip" method and when you do, use "sword" as your number.

        System.out.println(adam.attack());

    }

}
