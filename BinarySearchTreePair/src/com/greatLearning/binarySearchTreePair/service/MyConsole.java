package com.greatLearning.binarySearchTreePair.service;

import java.util.Scanner;

public class MyConsole {
	
	static Scanner scan=new Scanner(System.in);
	
	//Print message
	public static void print(String message) {
		System.out.println(message);
	}
	
	//Print message and take string user input
	public static int getIntegerValue(String message) {
		System.out.print(message);
		return scan.nextInt();
	}

}
