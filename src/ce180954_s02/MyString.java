/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_s02;

import java.util.Scanner;

/**
 * S02 - Reverse a string.
 * @author Le Khanh Dang _ CE180954 09/01/2025
 */
public class MyString {
    private String s;

    /**
     * Constructor to initialize the string with input.
     * @param input String to be set.
     */
    public MyString(String input) {
        s = input;
    }
    
    /**
     * Method to get the length of the string after splitting by space or underscore.
     * @return The length of the string in terms of the number of words.
     */
    public int getLength(){
        // Split by space or underscore
        String words[] = s.split("[ _]+"); 
        // Return the number of words
        return words.length; 
    }
    
    /**
     * Method to reverse the string by words and sub-words split by underscores.
     * @return The reversed string.
     */
    public String reverse(){
        // Split the string by spaces
        String words[] = s.split("[ _]+"); 
        // Initialize an empty string to store the reversed result
        String reversedString = "";
        
        //Reverse the order of words
        for(int i = words.length - 1; i >= 0; i--){
            // Split the word by underscores
//            String subWords[] = words[i].split("[ _]+"); 
            // Initialize an empty string to store the reversed result
//            String reversedSubWord = "";
            
            // Reverse each sub-word and handle underscores
//            for (int j = subWords.length - 1; j >= 0; j--) {
//                 // Add the current sub-word to the reversed sub-word string
//                reversedSubWord += subWords[j];
//                if (j > 0) {
//                    // Add underscore between sub-words
//                    reversedSubWord += "_"; 
//                }
//            }
//            //Add the reversed sub-word to the final reversed string
//            reversedString += reversedSubWord;
            reversedString += words[i];
            if (i > 0) {
                // Add space between words
                reversedString += " "; 
            }
        }
        // Return the reversed string
        return reversedString; 
    }
    
    /**
     * Method to display the original and reversed string.
     */
    public void display(){
        // Display the original string
        System.out.println("The old string: " + s); 
        // Display the reversed string
        System.out.println("The reversed string: " + reverse()); 
    }
}