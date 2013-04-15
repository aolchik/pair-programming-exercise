package com.aolchik.spike.powermock;

import static org.junit.Assert.*;

import org.junit.Test;

public class _StringParserTest {

	@Test
	public void removeLeading_shouldReturnStringWoLeadingChars() {
		StringParser stringParser = new StringParser();
		
		Object[][] testCases = new Object[][] { 
				{ "x", "xxxHi", "Hi" },
				{ "\\", "\\\\Hi\\", "Hi\\"},
				{ "a", "batata", "batata" }
		};
		
		for ( Object[] tc: testCases) {
			String result = stringParser.removeLeading(((String)tc[0]).charAt(0), (String)tc[1]);			
			assertTrue("removeLeading(" + tc[0] + ", " + tc[1] + ") == " + result + ", expected was " + tc[2], 
					tc[2].equals(result));
			
		}
	}

}
