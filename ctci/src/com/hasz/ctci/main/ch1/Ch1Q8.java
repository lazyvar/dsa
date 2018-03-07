package com.hasz.ctci.main.ch1;

public class Ch1Q8 {

	// if an element in the matrix is zero, set its row and column to zero
	public static void zero(int[][] matrix) {
		boolean[] rowNeedsZero = new boolean[matrix.length];
		boolean[] columnNeedsZero = new boolean[matrix[0].length];
	
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rowNeedsZero[i] = true;
					columnNeedsZero[j] = true;
				}
			}
		}
		
		for (int i = 0; i < rowNeedsZero.length; i++) {
			if (rowNeedsZero[i]) {
				zeroRow(i, matrix);
			}
		}
		
		for (int i = 0; i < columnNeedsZero.length; i++) {
			if (columnNeedsZero[i]) {
				zeroColumn(i, matrix);
			}
		}
	}
	
	private static void zeroRow(int row, int[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[row][i] = 0;
		}
	}
	
	private static void zeroColumn(int column, int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][column] = 0;
		}
	}
	
}
