package com.hasz.ctci.main.ch1;

public class Ch1Q7 {

	// assuming matrix is square
	public static void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length / 2; i++) {
			int squareSize = matrix.length - (2 * i);
			int left, right, top, bottom;
			
			left = top = i;
			right = bottom = i + squareSize - 1;

			for (int j = 0; j < squareSize - 1; j++) {
				int topLeft = matrix[top][left + j];
				
				matrix[top][left + j] = matrix[bottom - j][left];
				matrix[bottom - j][left] = matrix[bottom][right - j];
				matrix[bottom][right - j] = matrix[top + j][right];
				matrix[top + j][right] = topLeft;
			}
		}
	}
}