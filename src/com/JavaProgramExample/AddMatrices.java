package com.JavaProgramExample;

public class AddMatrices {
	
	public static void main(String[] args) {
		
		int [][] a={{2,4,5}, {7,8,9}};
		int [][] b={{5,9,3}, {0,1,2}};
		int row=2,col=3;
		
		int sum[][] =new int[row][col];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		
     // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row11 : sum) {
            for (int column : row11) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
	}

}
