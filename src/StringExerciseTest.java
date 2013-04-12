import static org.junit.Assert.*;

import org.junit.Test;


public class StringExerciseTest {

	@Test
	public void withoutXTest() {
		String[][] testCases = { 
				{"withoutX(\"xHix\") → \"Hi\"", "Hi", "xHix" },
				{"withoutX(\"xHi\") → \"Hi\"", "xHi", "Hi" },
				{"withoutX(\"Hxix\") → \"Hxi\"", "Hxix", "Hxi" } 		
		};
		
		StringExercise stringExercise = new StringExercise(); 
		for (String[] tc: testCases) {
			assertEquals(tc[0], tc[2], stringExercise.withoutX(tc[1]) );
		}
	}
}
