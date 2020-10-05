/* WAP TO ROTATE AN ARRAY RIGHT OR LEFT N NUMBER OF TIMES USING SWITCH CASE */

import java.util.*;
class RotateLeftRight
{
	public static void main(String args[])
	{
		int arr[]= new int[30];
		int i,ele,n,index,j,first,last,r;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		n = sc.nextInt();
		System.out.println("enter the element to array ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Do you want to rotate the array left(press L) or right(press r)");
		ch = sc.next().charAt(0);
		System.out.println("Enter the number of rotation");
		r = sc.nextInt();
		switch(ch)
		{
			case 'l':
			case 'L':
			{
				for(i=0;i<r;i++)
				{
					first = arr[0];
					for(j=0;j<n-1;j++)
						arr[j]=arr[j+1];
					arr[j]=first;
				}
				break;
			}
			case 'r':
			case 'R':
			{
				for(i=0;i<r;i++)
				{
					last = arr[n-1];
					for(j=n-1;j>0;j--)
						arr[j]=arr[j-1];
					arr[0]=last;
				}
				break;
			}
				
			
		}
		if(ch == 'r' || ch =='R')
			System.out.println("the array after "+ r +" right rotation is ");
		else
			System.out.println("the array after "+ r +" left rotation is ");
		for(i=0;i<n;i++)
			System.out.print(arr[i] + "  ");
	}
					
}	
