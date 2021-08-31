/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        int people = 0, pizza = 0, slices = 0;
        try
        {
            System.out.print("How many people? ");
            people = inp.nextInt();
        }
        catch (InputMismatchException exception)
        {
            System.out.print("Input is not numeric.");
            System.exit(0);
        }

        try
        {
            System.out.print("How many pizzas do you have? ");
            pizza = inp.nextInt();
        }

        catch (InputMismatchException exception)
        {
            System.out.print("Input is not numeric.");
            System.exit(0);
        }

        try
        {
            System.out.print("How many slices per pizza? ");
            slices = inp.nextInt();
        }

        catch (InputMismatchException exception)
        {
            System.out.print("Input is not numeric.");
            System.exit(0);
        }

        int total = pizza * slices;

        System.out.println(people + " people with " + pizza + " pizzas ("+ total + " slices)");

        int quo = total/people;
        int leftovers = total%people;

        if (quo == 1)
        {
            System.out.println("Each person gets " + quo + " piece of pizza.");
            System.out.println("There are " + leftovers + " leftover pieces.");
        }

        else
        {
            System.out.println("Each person gets " + quo + " pieces of pizza.");
            System.out.println("There are " + leftovers + " leftover pieces.");
        }
    }
}
