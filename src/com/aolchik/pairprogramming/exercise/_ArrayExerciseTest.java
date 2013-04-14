package com.aolchik.pairprogramming.exercise;
import static org.junit.Assert.*;

import org.junit.Test;



public class _ArrayExerciseTest {

	@Test
	public void maxMirrorTest() {
		
		ArrayExercise arrayExercise = new ArrayExercise();

		int t1[] = {1, 2, 3, 8, 9, 3, 2, 1};
		assertEquals("maxMirror({1, 2, 3, 8, 9, 3, 2, 1})", 3, arrayExercise.maxMirror(t1));
		
		int t2[] = {1, 2, 1, 4};
		assertEquals("maxMirror({1, 2, 1, 4})", 3, arrayExercise.maxMirror(t2));

		int t3[] = {7, 1, 2, 9, 7, 2, 1};
		assertEquals("maxMirror({7, 1, 2, 9, 7, 2, 1})", 2, arrayExercise.maxMirror(t3));


	}

}
