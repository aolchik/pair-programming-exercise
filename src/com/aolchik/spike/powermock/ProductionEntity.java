package com.aolchik.spike.powermock;

public class ProductionEntity {	
	private StringParser stringParser;
	private static final char trailingChar = 'x';

	public ProductionEntity(StringParser stringParser) {
		this.stringParser = stringParser;
	}
	
	public String processString(String toProcess) {
		return stringParser.removeLeading(trailingChar, toProcess);
	}

}
