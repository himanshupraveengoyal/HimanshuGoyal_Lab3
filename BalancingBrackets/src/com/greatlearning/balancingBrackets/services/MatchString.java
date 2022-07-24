package com.greatlearning.balancingBrackets.services;

public class MatchString {
	
	Character[] notClosedCharacters;
	int pointerPosition=-1;
	
	// Matching Input if opening tag is ending at right place
	public boolean IsInputMatching(String input) {
		if(input.length()%2!=0) return false;
		notClosedCharacters=new Character[input.length()];
		for (int i = 0; i < input.length(); i++) {
			if(CheckIfItsOpeningBraces(input.charAt(i)))
				PushValue(input.charAt(i));
			else {
				int ascii=(int) input.charAt(i);
				if(pointerPosition==-1) return false;
				int oldValue=(int) notClosedCharacters[pointerPosition];
				if(ascii==41 && oldValue!=40) return false;
				else if(ascii==93 && oldValue!=91) return false;
				else if(ascii==125 && oldValue!=123) return false;
				else PopValue();
			}
		}
		if(pointerPosition!=-1) return false;
		return true;
	}
	
	public Boolean CheckIfItsOpeningBraces(Character a) {
		int ascii=(int) a;
		if(ascii==40||ascii==91||ascii==123)
			return true;
		return false;
	}
	
	public void PushValue(Character c) {
		pointerPosition++;
		notClosedCharacters[pointerPosition]=c;
	}
	
	public void PopValue() {
		notClosedCharacters[pointerPosition]=' ';
		pointerPosition--;
	}
}