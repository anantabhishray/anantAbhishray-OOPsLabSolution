package com.OOPsLabSolution;

import java.util.Random;

public class Password {
	
	public char[] generatePassword() {
		
		String strCapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strSmallLetters = "abcdefghijklmnopqrstuvwxyz";
		String strNumbers = "0123456789";
		String strSpCharacters = "!@#$%^&*()_+";
		
		String strValues = strCapitalLetters+strSmallLetters+strNumbers+strSpCharacters;
		
		Random rd = new Random();
		
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			password[i] = strValues.charAt(rd.nextInt(strValues.length()));		
		}
		
		return password;
	}
}
