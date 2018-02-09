package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch1Q7Tests {

	@Test
	public void testRotate0By0() {
		int[][] matrix = {{}};
		int[][] expected = {{}};

		Ch1Q7.rotate(matrix);
		assertArrayEquals(expected, matrix);
	}
	
	@Test
	public void testRotate1By1() {
		int[][] matrix = {{1}};
		int[][] expected = {{1}};

		Ch1Q7.rotate(matrix);
		assertArrayEquals(expected, matrix);
	}
	
	@Test
	public void testRotate2By2() {
		int[][] matrix = {{1, 2}, {3, 4}};
		int[][] expected = {{4, 1}, {2, 3}};

		Ch1Q7.rotate(matrix);
		assertArrayEquals(expected, matrix);
	}
	
	@Test
	public void testRotate4By4() {
		int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] expected = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};

		Ch1Q7.rotate(matrix);
		assertArrayEquals(expected, matrix);
	}

}
