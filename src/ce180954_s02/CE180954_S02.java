/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_s02;

/**
 * S02 - Reverse a string.
 * @author Le Khanh Dang _ CE180954 09/01/2025
 */
public class CE180954_S02 {

    /**
     * Main method to execute the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IO io = new IO(); // Create an IO object to handle input
        
        while (true) {            
            // Get string input from user
            String input = io.getStringInput();
            
            // Create MyString object with the input
            MyString myStr = new MyString(input);

            // Display the original and reversed string
            myStr.display();

            // Check if user wants to continue or exit
            if (!io.checkInput()) {
                System.out.println("Exiting the program.");
                return;  // Exit the program if ESC is pressed
            }

            System.out.println("Program continues.");
        }
    }
}