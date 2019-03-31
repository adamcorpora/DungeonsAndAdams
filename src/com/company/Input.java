package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Input {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();//creates an Array named words
        StringBuilder builder = new StringBuilder();

        System.out.print("Enter a string: ");
        Scanner adam = new Scanner(System.in);      //whatever you type in, store it in scanner "adam"
        String verb = adam.next();                 //convert "adam" to a string "verb"
        while (!verb.equals("exit")) {
            System.out.print("Enter a string: ");
            words.add(verb);                //add another string "verb" to the array "words"
            verb = adam.next();             //string "verb" now equals whatever is next in scanner "adam"
        }

        if (verb.equals("exit")) {
            System.out.println("Thank you");
            for (String sText : words) {
                String sReverse = new StringBuilder(sText).reverse().toString();
                System.out.println(sReverse);


            }
        }
    }
}