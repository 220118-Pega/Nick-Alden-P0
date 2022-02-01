package com.revature.hangman;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// Use scanner to read console to get user input via console
		// needs an input stream, in this case we use the System.in, which is the console	
			Scanner myScanner = new Scanner(System.in);
			
				//Set initial number of bady parts which corresponds to number of wrong guesses
				int bodyParts = 6;
				
				// Ask user for input - word to guess
				System.out.println("Enter word to be guessed: ");
				// Get user input
				
				
				// To print current guess state
				// Store original word since we will be removing letters from mystery word
				String originalWord = mysteryWord;
				
				while (bodyParts > 0) {
					
				}
	}

}
