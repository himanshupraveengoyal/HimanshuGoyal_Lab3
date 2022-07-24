package com.greatlearning.balancingBrackets.services;
import java.util.Scanner;
public class MyConsole {
	
	static Scanner scan=new Scanner(System.in);
	
	//Print message
	public static void print(String message) {
		System.out.println(message);
	}
	
	//Print message and take string user input
	public static String getStringValues(String message) {
		System.out.print(message);
		return scan.nextLine();
	}
}
