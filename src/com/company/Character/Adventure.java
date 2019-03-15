package com.company.Character;

public class Adventure {
    public static void main(String[] args) {

        Character Adam = new Character(new Weapon ("ax", 2));

        Weapon selectedweapon = new Weapon("sword", 3);

        System.out.println("\n");

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
