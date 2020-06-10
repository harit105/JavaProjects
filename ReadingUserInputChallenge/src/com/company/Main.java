//Read 10 numbers from the console entered by the user and print the sum of those numbers.
//Create a Scanner
//Use the hasNextInt() method from the scanner to check if the user has entered an int value
// if hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
// Use the nextInt() method to get the number and add it to the sum.
//Before the user enters each number, print the message "Enter number #x:", where x represents the count, i.e. 1, 2,3,4 etc
//hint use a while loop
//use a counter variable for counting numbers

package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int counter=0;
        int sum=0;
        //this loop never ends because of true
        while (true){
            int order= counter+1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt= scanner.hasNextInt();
            if(isAnInt){
                int number= scanner.nextInt();
                counter++;
                sum += number;

                if(counter==10){
                    break;
                }

            }else{
                System.out.println("Invalid number");
            }
            scanner.nextLine();//handles end of line (enter key)
        }
        System.out.println("sum= " + sum);

        scanner.close();

    }
}
