/* WAP TO FIND THE TRANSPOSE OF A MATRIX */

import java.util.*;
class Transpose
{
	public static void main(String args[])
	{
		
		int arr[][]= new int[30][30];
		int ar[][]= new int[30][30];
	
		
		int i,j,m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of row and column of array");
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.println("enter the element to array ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("Enter value");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("the original array is ");
		for(i=0;i<m;i++)
			{
				System.out.println("");
				for(j=0;j<n;j++)
				{
					System.out.print(arr[i][j] + "  ");
				}
			}
		System.out.println("");
		System.out.println("The transpose of matrix is ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				ar[j][i]=arr[i][j];
			}
		}
		System.out.println("Values are");
		for(i=0;i<n;i++)
		{
			System.out.println("");
			for(j=0;j<m;j++)
			{
				System.out.print(ar[i][j] + "  ");
			}	
		}
	}
}
