package com.aolchik.spike.powermock;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class _ProductionEntity {

	@Test
	public void processString_shouldCallremoveLeading() {
		String messageToParse = "xHi";
		char trailingAndLeadingChar ='x';
		
		StringParser mockedStringParser = mock(StringParser.class);
		
		ProductionEntity productionEntity = new ProductionEntity(mockedStringParser);
		
		productionEntity.processString("xHi");
		
		verify(mockedStringParser).removeLeading(trailingAndLeadingChar, messageToParse );
	}

}
