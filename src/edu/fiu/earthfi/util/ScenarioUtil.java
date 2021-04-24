package edu.fiu.earthfi.util;

/**
 * Static Utilities for the project 
 */
public class ScenarioUtil {

	/**
	 * Prints a message with a delay and leaves some empty lines 
	 * @param message The message to print
	 * @param lines The amount of lines to leave blank
	 */
	public static void printMessageWithDelay(String message, int lines) {
		System.out.println(message);
		for (int i = 0; i < lines; i++) {
			System.out.println();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * Prints a message with a delay. 
	 * @param message The message to print
	 */
	public static void printMessageWithDelay(String message) {
		printMessageWithDelay(message, 0);
	}
	
}
