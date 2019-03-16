package com.company.Character;

import java.util.Random;

public class DiceRoll {
    int diceFaces = 2;
    int diceQuantity = 1;
    int roll;
    int total;

    public DiceRoll (int diceQuantity, int diceFaces) {
        this.diceFaces = diceFaces;
        this.diceQuantity = diceQuantity;
    }
    public int roll () {
        this.roll = total;
        return (int) (Math.random() * ((diceFaces*diceQuantity) - diceQuantity) + diceQuantity);
    }
}