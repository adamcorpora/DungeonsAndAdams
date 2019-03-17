package com.company.Character;

import java.util.Random;

public class Character {
    String[] attributes = {" strength", " dexterity", " constitution", " wisdom", " intelligence", " charisma"};
    int strengthRoll;
    int dexterityRoll;
    int constitutionRoll;
    int wisdomRoll;
    int intRoll;
    int charRoll;
    Weapon myEquippedWeapon;



    public Character() {
        System.out.println("A character named Adam created with:");
        this.strengthRoll = getRoll(18, 3);
        this.dexterityRoll = getRoll(18, 3);
        this.constitutionRoll = getRoll(18, 3);
        this.wisdomRoll = getRoll(18, 3);
        this.intRoll = getRoll(18, 3);
        this.charRoll = getRoll(18, 3);
        this.myEquippedWeapon = new Weapon(0, "Fists");
        /*for (int i = 0; i < 6; i++) {
            int random = (int) (Math.random() * 17 + 1);
            if (i == 0) {
                this.strengthRoll = random;
            } else if (i == 1) {
                this.dexterityRoll = random;
            }
            System.out.println(random + attributes[i]);
        }*/
    }

    public Character(Weapon weapon) {
        this();
        myEquippedWeapon = weapon;
    }

    private static int getRoll(int max, int min) {
        return (int) (Math.random() * (max - min)  + min);
    }


    public int attack() {
        System.out.println("\n" + "Adam equipped a sword! It does 3d12 damage plus strength damage!" + "\n");
        System.out.print("Adam strikes! The rolls are");
        int sum = 0;
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
        return getRoll(12, 1);
    }

    public void equip(Weapon theWeaponIWasSent) {
        this.myEquippedWeapon = theWeaponIWasSent;
    }
}