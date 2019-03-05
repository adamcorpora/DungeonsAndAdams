package com.company;

import java.util.Arrays;
import java.util.List;

public class ListStuff {
    public static void main(String[] args) {
        List<String> classList = Arrays.asList("Wizard", "Cleric", "Fighter", "Bard", "Rogue", "Ranger", "Barbarian", "Paladin", "Druid", "Sorcerer", "Warlock", "Monk");
        List<String> raceList = Arrays.asList("Dragonborn", "Dwarf", "Elf", "HalfElf", "Human", "Gnome", "Half-Orc", "Halfling", "Tiefling");
        List<String> playerList = Arrays.asList("Player 1", "Player 2", "Player 3");

        for (String playername : playerList) {
            System.out.println(playername);

            int cl = (int) (Math.random() * classList.size());
            System.out.println("Class: " + classList.get(cl));

            int ra = (int) (Math.random() * raceList.size());
            System.out.println("Race: " + raceList.get(ra));

            System.out.println("Attributes: ");
            List<String> attributeList = Arrays.asList("Strength -- ", "Dexterity -- ", "Constitution -- ", "Intelligence -- ", "Wisdom -- ", "Charisma -- ");
            for (String attributename : attributeList) {
                System.out.println(attributename);

                int dice1 = (int) (Math.random() * 6 + 1);
                System.out.print(dice1 + " ");
                int dice2 = (int) (Math.random() * 6 + 1);
                System.out.print(dice2 + " ");
                int dice3 = (int) (Math.random() * 6 + 1);
                System.out.print(dice3 + " ");
                int dice4 = (int) (Math.random() * 6 + 1);
                System.out.println(dice4);

                int[] values = {dice1, dice2, dice3, dice4};
                int smallest = values[0];
                for (int x = 0; x < values.length; x++) {
                    if (values[x] < smallest) {
                        smallest = values[x];
                    }
                }

                System.out.println("(Drop the " + smallest + ")");

//Here's the modifiers
                int modifier;
                if (ra == 0 && attributename.equals("Strength -- ")) {
                    modifier = 2;
                    System.out.println("Dragonborns add " + modifier);
                    int sum = dice1 + dice2 + dice3 + dice4 - smallest + modifier;
                    System.out.println("Total: " + sum + "\n");
                } else if (ra == 1 && attributename.equals("Constitution -- ")) {
                    modifier = 2;
                    System.out.println("Dwarves add " + modifier);
                    int sum = dice1 + dice2 + dice3 + dice4 - smallest + modifier;
                    System.out.println("Total: " + sum + "\n");
                } else if (ra == 2 && attributename.equals("Dexterity -- ")) {
                    modifier = 2;
                    System.out.println("Elves add " + modifier);
                    int sum = dice1 + dice2 + dice3 + dice4 - smallest + modifier;
                    System.out.println("Total: " + sum + "\n");
                } else if (ra == 3 && attributename.equals("Charisma -- ")) {
                    modifier = 2;
                    System.out.println("HalfElves add " + modifier);
                    int sum = dice1 + dice2 + dice3 + dice4 - smallest + modifier;
                    System.out.println("Total: " + sum + "\n");
                } else if (ra == 4) {
                    modifier = 1;
                    System.out.println("Humans add " + modifier + " to everything.");
                    int sum = dice1 + dice2 + dice3 + dice4 - smallest + modifier;
                    System.out.println("Total: " + sum + "\n");
                } else if (ra == 5 && attributename.equals("Intelligence -- ")) {
                    modifier = 2;
                    System.out.println("Gnomes add " + modifier);
                    int sum = dice1 + dice2 + dice3 + dice4 - smallest + modifier;
                    System.out.println("Total: " + sum + "\n");
                } else if (ra == 6 && attributename.equals("Strength -- ")) {
                    modifier = 2;
                    System.out.println("Half-Orcs add " + modifier);
                    int sum = dice1 + dice2 + dice3 + dice4 - smallest + modifier;
                    System.out.println("Total: " + sum + "\n");
                } else if (ra == 7 && attributename.equals("Dexterity -- ")) {
                    modifier = 2;
                    System.out.println("Halflings add " + modifier);
                    int sum = dice1 + dice2 + dice3 + dice4 - smallest + modifier;
                    System.out.println("Total: " + sum + "\n");
                } else if (ra == 8 && attributename.equals("Intelligence -- ")) {
                    modifier = 1;
                    System.out.println("Tieflings add " + modifier);
                    int sum = dice1 + dice2 + dice3 + dice4 - smallest + modifier;
                    System.out.println("Total: " + sum + "\n");
                } else System.out.println("Total: " + (dice1 + dice2 + dice3 + dice4 - smallest) + "\n");

            }
        }
    }
}