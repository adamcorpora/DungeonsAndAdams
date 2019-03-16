package com.company.Character;

public class Adventure {
    public static void main(String[] args) {

        Character Adam = new Character(new Weapon (2, "ax"));

        Weapon selectedweapon = new Weapon(3, "sword");

        System.out.println("\n");

        DiceRoll roll = new DiceRoll(3,12); // 3d12
        int result = roll.roll();
        System.out.println(result);  //should be some random number between 3 and 36

        Wizard Joe = new Wizard ();
        Joe.castSpells();
        Joe.dispelMagic();

        Cleric Bob = new Cleric ();
        Bob.castSpells();
        Bob.turnUndead();

        Fighter Julie = new Fighter();
        Julie.bustHeads();
        Julie.actionSurge();

        Rogue Gwen = new Rogue ();
        Gwen.bustHeads();
        Gwen.sneakAttack();





        Adam.equip(selectedweapon);

        System.out.println(Adam.attack());

    }

}
