package com.company.Character;

import java.util.Random;

public class Character {
    String[] attributes = {" strength", " dexterity", " constitution", " wisdom", " intelligence", " charisma"};

    public Character() {
        System.out.println("A character named Adam created with:");
        for (int i = 0; i < 6; i++) {
            int random = (int) (Math.random() * 17 + 1);
            System.out.println(random + attributes[i]);
        }
    }

    int sum = 0;

    public int attack() {
        System.out.println("\n" + "Adam equipped a sword! It does 3d12 damage plus strength damage!" + "\n");
        System.out.print("Adam strikes! The rolls are");
        for (int j = 0; j < 3; j++) {
            int roll = D12();
            sum += roll;
            System.out.print(" " + roll + "(d12) +");
        }
        Random random = new Random();
        int index = random.nextInt(attributes.length);
        System.out.print(attributes[index] + " modifier");
        //how do I pull out the randomly generated number for the random attribute?
        System.out.print("\n" + "The total damage is ");
        return sum;
    }

    private static int D12() {
        return (int) (Math.random() * 11 + 1);
    }

    public void equip(Weapon sword) {

    }
}
    weapon equipped weapon=