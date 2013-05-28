package com.aolchik.pairprogramming.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathExercisesTest {

	@Test
	public void testFibo() {
		int[][] testCases = {
				{ 0, 0 },
				{ 1, 1 },
				{ 2, 1 },
				{ 3, 2 },
				{ 4, 3 }
		};
		
		for (int[] tc: testCases ) {
			assertEquals("fibo("+ tc[0] + ")", 
					tc[1], MathExercises.fibo(tc[0]));
		}
	}

}
