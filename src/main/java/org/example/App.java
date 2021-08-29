package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
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
