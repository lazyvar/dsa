package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch1.Ch1Q8;

public class Ch1Q8Tests {

	@Test
	public void testZeroMatrix0By0() {
		int[][] matrix = {{}};
		int[][] expected = {{}};

		Ch1Q8.zero(matrix);
		assertArrayEquals(expected, matrix);
	}
	
	@Test
	public void testZeroMatrix1By1() {
		int[][] matrix = {{1}};
		int[][] expected = {{1}};

		Ch1Q8.zero(matrix);
		assertArrayEquals(expected, matrix);
	}
	
	@Test
	public void testZeroMatrix2By2() {
		int[][] matrix = {	{1, 0}, 
				 		    	{3, 4} };
		int[][] expected = {	{0, 0}, 
				           	{3, 0} };

		Ch1Q8.zero(matrix);
		assertArrayEquals(expected, matrix);
	}
	
	@Test
	public void testZeroMatrix4By4() {
		int[][] matrix = {	{1, 2, 3, 4}, 
						   	{5, 6, 0, 8}, 
						   	{9, 10, 11, 12}, 
						   	{13, 14, 15, 16} };
		int[][] expected = {	{1, 2, 0, 4}, 
			   				{0,0, 0, 0}, 
			   				{9, 10, 0, 12}, 
			   				{13, 14, 0, 16} };

		Ch1Q8.zero(matrix);
		assertArrayEquals(expected, matrix);
	}
	
	@Test
	public void testZeroMatrixBy5() {
		int[][] matrix = {	{1, 0, 3, 4, 5}, 
						   	{6, 7, 8, 9, 10}, 
						   	{11, 12, 13, 14, 15}, 
						   	{16, 17, 18, 0, 20},
							{21, 22, 23, 24, 25} };
		int[][] expected = {	{0, 0, 0, 0, 0}, 
			   				{6, 0, 8, 0, 10}, 
			   				{11, 0, 13, 0, 15}, 
			   				{0, 0, 0, 0, 0},
			   				{21, 0, 23, 0, 25} };

		Ch1Q8.zero(matrix);
		assertArrayEquals(expected, matrix);
	}

}
