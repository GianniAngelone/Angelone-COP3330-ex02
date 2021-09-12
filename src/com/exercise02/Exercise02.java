/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package com.exercise02;
import java.util.Scanner;

class Exercise02 {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("What is input string? ");
            String word = input.nextLine(); 
            int length = word.length();
            System.out.println(String.format("%s has %d characters.", word, length));
        }
    }
