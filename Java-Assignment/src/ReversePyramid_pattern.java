package com.tns.coreJava;
import java.io.*;

public class ReversePyramid_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring and initializing variable to
        // Size of the pyramid
        int number = 7;
  
        int i = number, j;
  
        // Nested while loops
        // Outer loop
     // Till condition holds true
        while (i > 0) {
            j = 0;
  
            // Inner loop
            // Condition check
            while (j++ < number - i) {
                // Print whitespaces
                System.out.print(" ");
            }
  
            j = 0;
  
            // Inner loop
            // Condition check
            while (j++ < (i * 2) - 1) {
                // Print star
                System.out.print("*");
            }
  
            // By now, we reach end of execution for one row
            // so next line
            System.out.println();
  
            // Decrementing counter because we want to print
            // reverse of pyramid
            i--;
        }
    }

}
