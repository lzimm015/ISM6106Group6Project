package edu.fiu.earthfi.util;

public class ScenarioUtil {

	public static void printMessage(String message, int lines) {
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
	
	public static void printMessage(String message) {
		printMessage(message, 0);
	}
	
}
