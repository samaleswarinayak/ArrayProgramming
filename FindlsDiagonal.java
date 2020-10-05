/* WAP TO FIND THE LARGEST AND SMALLEST NUMBER IN DIAGONAL */

import java.util.*;
class FindlsDiagonal
{
	public static void main(String args[])
	{		
		int arr[][]= new int[6][6];
		int i,j,n,small,large,small1,large1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array(must be square)");
		n = sc.nextInt();
		System.out.println("enter the element to array ");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		
		System.out.println("the  array is ");
		for(i=0;i<n;i++)
			{
				System.out.println("");
				for(j=0;j<n;j++)
					System.out.print(arr[i][j] + "  ");
			}
		System.out.println("");
		small= arr[0][0];
		large= arr[0][0];
		small1=arr[0][n-1];
		large1=arr[0][n-1];
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					
					if(small >arr[i][j])
						small=arr[i][j];
					if(large <arr[i][j])
						large=arr[i][j];
				}
				if(i+j == n-1)
				{
					if(small1 >arr[i][j])
						small1=arr[i][j];
					if(large <arr[i][j])
						large1=arr[i][j];
				}
			}
			
				
		System.out.println("The smallest and largest element in diagonal 1 is " + small + "  " + large);
		System.out.println("The smallest and largest element in diagonal 2 is " + small1 + "  " + large1);
	}
}
