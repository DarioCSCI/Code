import java.util.Scanner;

/**
	This program demonstrates how to sum and transpose
	the contents of a matrices.
*/

public class Problem1
{
	public static void main(String[] args)
	{
		final int ROW1 = 3;
		final int COL1 = 3;
		double[][] matrix1 = new double [ROW1][COL1];
		final int ROW2 = 3;
		final int COL2 = 3;
		double[][] matrix2 = new double [ROW2][COL2];
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter elements for the first 3 x 3 matrix: ");
		
		for (int row = 0; row < ROW1; row++)
		{
			for (int col = 0; col < COL1; col++)
			{
				matrix1[row][col] = keyboard.nextDouble();
			}
		}
		
		System.out.println("Enter elements for the second 3 x 3 matrix: ");
		
		for (int row = 0; row < ROW2; row++)
		{
			for (int col = 0; col < COL2; col++)
			{
				matrix2[row][col] = keyboard.nextDouble();
			}
		}
		
		double transposeMatrix2[][] = new double [3][3];
		// Transposes matrix 2
		for (int row = 0; row < ROW2; row++)
		{
			for (int col = 0; col < COL2; col++)
			{
				transposeMatrix2[col][row] = matrix2[row][col];
			}
		}
		
		double sum[][] = new double [3][3];
		// Sums matrix 1 and matrix 2 transposed
		for (int row = 0; row < ROW2; row++)
		{
			for (int col = 0; col < COL2; col++)
			{
				sum[row][col] = matrix1[row][col] + transposeMatrix2[row][col];
			}
		}
		
		// double sumTranspose[][] = new double [3][3];
		
	//	for (int row = 0; row < ROW2; row++)
	//	{
		//	for (int col = 0; col < COL2; col++)
		//	{
		//		sumTranspose[col][row] = sum[row][col];
		//	}
	//	}
		
		System.out.print("Matrix 1");
		
		for(int row = 0; row < matrix1.length; row++)
		{
				System.out.println();
			for (int col = 0; col < matrix1[0].length; col++)
			{
				System.out.print(matrix1[row][col] + "  ");
			}
		}
		
		System.out.println();
		System.out.print("Matrix 2");
		
		for(int row = 0; row < matrix2.length; row++)
		{
				System.out.println();
			for (int col = 0; col < matrix2[0].length; col++)
			{
				System.out.print(matrix2[row][col] + "  ");
			}
		}
		
		System.out.println();
		System.out.print("Matrix 2 Transpose");
		System.out.println();
		
		for (int row = 0; row < transposeMatrix2.length; row++)
		{
			for (int col = 0; col < transposeMatrix2[0].length; col++)
			{
				System.out.print(transposeMatrix2[row][col] + "  ");
			}
			System.out.println();
		}
	
		System.out.print("Matrix 1 + Matrix 2 Transposed");
		System.out.println();
		
		// Prints sum of matrix 1 and matrix 2 transposed
		for (int row = 0; row < sum.length; row++)
		{
			for (int col = 0; col < sum[0].length; col++)
			{
				System.out.print(sum[row][col] + "  ");
			}
			System.out.println();
		}
	}
}