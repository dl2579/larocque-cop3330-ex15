package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        String Pass = "abc$123";
        Scanner sc = new Scanner(System.in);

        System.out.print( "What is the password? " );
        String input = sc.nextLine();

        if(input.equals(Pass)){
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}
