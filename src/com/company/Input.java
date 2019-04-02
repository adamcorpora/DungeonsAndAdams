package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Input {
    public static void main(String[] args) {

        ArrayList<String> arrayWords = new ArrayList<>();//creates an Array named words
        StringBuilder builder = new StringBuilder();

        System.out.print("Enter a string. (Type exit to quit): ");
        Scanner scannerAdam = new Scanner(System.in);           //whatever you type in, store it in scanner "adam"
        String stringVerb = scannerAdam.next();                 //convert "adam" to a string "verb". asks for input
        while (!stringVerb.equals("exit")) {
            System.out.print("Enter a string. (Type exit to quit): ");
            arrayWords.add(stringVerb);                //add another string "verb" to the array "words"
            stringVerb = scannerAdam.next();             //string "verb" now equals whatever is next in scanner "adam"
        }

        if (stringVerb.equals("exit")) {
            System.out.println("Thank you. Your strings are:");
            System.out.println(arrayWords);
            System.out.println("\n");
            System.out.println("Each string backward is:");
            for (String sText : arrayWords) {
                String sReverse = new StringBuilder(sText).reverse().toString();
                System.out.println(sReverse);
            }
            System.out.println("\n" + "Your strings in reverse order are:");
            Collections.reverse(arrayWords);
            System.out.println(arrayWords);
            }
            }
        }