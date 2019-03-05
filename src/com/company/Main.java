package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String name;
        int age;
        double favnum;

        Scanner kb = new Scanner (System.in);

        System.out.println("What is your name?");
        name = kb.nextLine();

        System.out.println("How old are you?");
        age = kb.nextInt();

        System.out.println("What is your favorite number?");
        favnum = kb.nextDouble();


        System.out.println("Your name is " + name + ", your are " + age + " years old, and your favorite number is " + favnum + ".");

        if (age < 13) {
            System.out.println("You are so young.");
        }
        else if (age < 20) {
            System.out.println("You're a teenager.");
        }
        else {
            System.out.println("You grow up so fast.");
        }
// This is a comment.

    }
}
