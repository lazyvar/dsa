package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch1.Ch1Q7;

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
		int[][] matrix = {	{1, 2}, 
				 		    	{3, 4} };
		int[][] expected = {	{3, 1}, 
				           	{4, 2} };

		Ch1Q7.rotate(matrix);
		assertArrayEquals(expected, matrix);
	}
	
	@Test
	public void testRotate4By4() {
		int[][] matrix = {	{1, 2, 3, 4}, 
						   	{5, 6, 7, 8}, 
						   	{9, 10, 11, 12}, 
						   	{13, 14, 15, 16} };
		int[][] expected = {	{13, 9, 5, 1}, 
							{14, 10, 6, 2}, 	
							{15, 11, 7, 3}, 
							{16, 12, 8, 4} };

		Ch1Q7.rotate(matrix);
		assertArrayEquals(expected, matrix);
	}
	
	@Test
	public void testRotate5By5() {
		int[][] matrix = {	{1, 2, 3, 4, 5}, 
						   	{6, 7, 8, 9, 10}, 
						   	{11, 12, 13, 14, 15}, 
						   	{16, 17, 18, 19, 20},
							{21, 22, 23, 24, 25} };
		int[][] expected = {	{21, 16, 11, 6, 1}, 
							{22, 17, 12, 7, 2}, 
							{23, 18, 13, 8, 3}, 
							{24, 19, 14, 9, 4},
							{25, 20, 15, 10, 5} };

		Ch1Q7.rotate(matrix);
		assertArrayEquals(expected, matrix);
	}

}
