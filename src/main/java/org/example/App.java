package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("What is the input string? ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        System.out.println(response + " has " + response.length() + " characters.");
    }
}
