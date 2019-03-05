package com.company.Character;

public class Adventure {
    public static void main(String[] args) {
        Character adam = new Character();
        // this is like int x = 3
        Weapon sword = new Weapon();
        adam.equip(sword);
        System.out.println(adam.attack());
    }

    // Name a random Class. Set random stats. Name a weapon randomly.
}
