/* WAP TO FIND THE MULTIPLICATION OF TWO MATRIX */

import java.util.*;
class MultiplyMatrix
{
	public static void main(String args[])
	{
		
		int arr[][]= new int[30][30];
		int ar[][]= new int[30][30];
		int ar1[][]= new int[30][30];
		
		int i,ele,n,index,j,m,m1,n1,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of row and column of first array");
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.println("enter the element to array ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("Enter the value");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the size of row and column of second array");
		m1 = sc.nextInt();
		n1 = sc.nextInt();
		System.out.println("enter the element to array ");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.println("Enter the value");
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("the first array is ");
		for(i=0;i<m;i++)
			{
				System.out.println("");
				for(j=0;j<n;j++)
				{
					System.out.print(arr[i][j] + "  ");
				}
			}
		System.out.println("");
		System.out.println("the Second  array is ");
		for(i=0;i<m1;i++)
			{
				System.out.println("");
				for(j=0;j<n1;j++)
				{
					System.out.print(ar[i][j] + "  ");
				}
			}
		System.out.println("");		
		if(n==m1)
		{
			System.out.println("the multiplication of two array are");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n1;j++)
				{
					ar1[i][j]=0;
					for(k=0;k<n;k++)
					{
						ar1[i][j] += arr[i][k] * ar[k][j];
					}
				}
			}
					
		    for(i=0;i<m;i++)
			{
				System.out.println("");
				for(j=0;j<n1;j++)
				{
					System.out.print(ar1[i][j] + "  ");
				}
			}
		}
		else
		{
			System.out.println("Multiplication is not possible");
        }
	}
}
