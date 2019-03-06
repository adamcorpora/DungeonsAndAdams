package com.company.Character;

public class Character {

    public Character() {
        System.out.println("A character named Adam created with:");
        String[] attributes = {" strength", " dexterity", " constitution", " wisdom", " intelligence", " charisma"};
        for (int i = 0; i < 6; i++) {
            int random = (int) (Math.random() * 17 + 1);
            System.out.println(random + attributes[i]);
        }
    }

    public int attack() {
        System.out.println("\n" + "Adam equipped a sword! It does 3d12 damage plus strength damage!" + "\n");
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            int roll = D12();
            System.out.println("Adam strikes! It does " + roll + " damage.");
        }

        return 0;

    }
    private static int D12() {
        return (int) (Math.random() * 11 + 1);
    }

               public void equip (Weapon sword){
                }
            }
