/* WAP TO ROTATE A 2D MATRIX BY 90 degree  CLOCKWISE AND ANTICLOCKWISE */

import java.util.*;
class MatrixRotate90Degree
{
	public static void main(String[] args)
	{
		int [][] a = new int[3][3];
		int [][] b = new int[3][3]; 
		int i,j;
		System.out.println("enter matrix1");
		java.util.Scannersc = new java.util.Scanner(System.in);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Enter value");
				a[i][j]=sc.nextInt();
				b[i][j]=a[i][j];
			}
		}
		System.out.println("The anti-clockwise rotation of the matrix is ");
		AntiClockise_RotateMatrix(3,a);
		System.out.println("The clockwise rotation of the matrix is "); 
		ClockWise_RotateMatrix(3,b);  			
		
		
	}
	static void AntiClockise_RotateMatrix(int n,int[][] a)
	{
		int i,j,temp;
		for (i=0;i<n/2;i++ ) {
			for(j=i;j<n-1-i;j++)
			{

				temp=a[i][j];
				a[i][j]=a[j][n-1-i];
				a[j][n-1-i]=a[n-1-i][n-1-j];
				a[n-1-i][n-1-j]=a[n-1-j][i];
				a[n-1-j][i]=temp;
			}
			
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

	}
	static void ClockWise_RotateMatrix(int n,int[][] a)
	{
		int i,j,temp;
		for (i=0;i<n/2;i++ ) 
		{
			for(j=i;j<n-i-1;j++)
			{

				temp=a[i][j];
				a[i][j]=a[n-1-j][i];
				a[n-1-j][i]=a[n-1-i][n-1-j];
				a[n-1-i][n-1-j]=a[j][n-1-i];
				a[j][n-1-i]=temp;
			}
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

	}
}
