package com.company.Character;

public class Adventure {
    public static void main(String[] args) {
        Character emptyshell = new Character();
        Weapon selectedweapon = new Weapon();

        emptyshell.equip(selectedweapon);

        System.out.println(emptyshell.attack());

    }

}
