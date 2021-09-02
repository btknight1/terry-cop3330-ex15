/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final String password = "abc$123";

        System.out.print("What is the password? ");
        String inputPass = input.nextLine();

        if(inputPass.equals(password))
        {
            System.out.print("Welcome!");
        }
        else
        {
            System.out.print("I don't know you.");
        }
    }
}