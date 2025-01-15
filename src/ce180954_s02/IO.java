/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_s02;

import java.util.Scanner;

/**
 * S02 - Reverse a string.
 *
 * @author Le Khanh Dang _ CE180954 09/01/2025
 */
public class IO {

    Scanner sc = new Scanner(System.in);

    /**
     * Prompts user for a valid string input and validates it.
     *
     * @return Valid user input string.
     */
    public String getStringInput() {
        // Declare a variable to store user input
        String s;

        // Loop until a valid string is entered
        while (true) {
            System.out.print("Please enter string: ");
            // Read user input
            s = sc.nextLine();
            try {
                // Check if the input is empty or only whitespace
                if (s.trim().isEmpty()) {
                    // Throw an exception if the string is empty or whitespace only
                    throw new IllegalArgumentException("The string cannot be empty or just whitespace.");
                }

                // Create MyString object and check its length
                MyString myStr = new MyString(s);
                // Check if the length of the string is less than or equal to 1
                if (myStr.getLength() <= 1) {
                    // Throw an exception if the string length is invalid
                    throw new IllegalArgumentException("The length of the string cannot be less than 1.");
                }
                // Exit loop if valid input is provided
                break;
            } catch (IllegalArgumentException e) {
                // Print error message if validation fails
                System.out.println(e.getMessage());
            }
        }
        // Return the valid string
        return s;
    }

    /**
     * Checks user input for continuing or exiting the program.
     *
     * @return True if Enter is pressed, False if ESC is pressed.
     */
    public boolean checkInput() {
        System.out.print("Press Enter to continue, ESC to exit. ");

        String input = sc.nextLine();

        // If Enter is pressed, continue the program
        if (input.trim().isEmpty()) {
            return true;
        } // If ESC is pressed, exit the program
        else if (input.equalsIgnoreCase("ESC")) {
            return false;
        }
        // Continue by default for other inputs
        return true;
    }
}
