package com.aolchik.spike.powermock;

public class StringParser {
	public String removeLeading(char leadingChar, String toProcess) {
		int charsToExtract = 0;
		for (int i = 0; i < toProcess.length(); i++) {
			if(toProcess.charAt(i) == leadingChar)
				charsToExtract++;
			else
				break;
		}
		return toProcess.substring(charsToExtract, toProcess.length());	
	}
}

