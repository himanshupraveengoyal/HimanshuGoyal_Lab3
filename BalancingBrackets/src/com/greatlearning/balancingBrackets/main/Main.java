package com.greatlearning.balancingBrackets.main;
import com.greatlearning.balancingBrackets.services.*;

public class Main {

	public static void main(String[] args) {
		
		//Display message and take input
		String input=MyConsole.getStringValues("Enter the input:");
		
		//Object of match String
		MatchString match=new MatchString();
		
		//If input matched then first message else other message
		if(match.IsInputMatching(input))
			MyConsole.print("The entered String has Balanced Brackets");
		else
			MyConsole.print("The entered Strings do not contain Balanced Brackets");
	}
}
