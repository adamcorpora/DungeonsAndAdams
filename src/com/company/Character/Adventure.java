package com.company.Character;

import com.company.Character.Spellguys.Cleric;
import com.company.Character.Offenseguys.Fighter;
import com.company.Character.Offenseguys.Rogue;
import com.company.Character.Spellguys.Wizard;

public class Adventure {
    public static void main(String[] args) {

        Weapon selectedweapon = new Weapon("sword", 3);

        System.out.println("\n");

        DiceRoll roll = new DiceRoll(3,12); // 3d12
        int result = roll.roll();
        System.out.println("Assignment Number One: " + result);  //should be some random number between 3 and 36

        Wizard Joe = new Wizard ();
        Joe.castSpells();
        Joe.dispelMagic();

        Cleric Bob = new Cleric ();
        Bob.castSpells();
        Bob.turnUndead();

        Fighter Julie = new Fighter ();
        Julie.bustHeads();
        Julie.actionSurge();

        Rogue Gwen = new Rogue ();
        Gwen.bustHeads();
        Gwen.sneakAttack();


    }

}
