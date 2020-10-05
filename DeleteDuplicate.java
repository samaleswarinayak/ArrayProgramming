/* WAP TO DELETE THE DUPLICATE ELEMENT FROM THE ARRAY */

import java.util.*;
class DeleteDuplicate
{
	public static void main(String args[])
	{
		int arr[]= new int[10];
		int ar[]= new int[10];
		int i,n,k=0,j;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		n = sc.nextInt();
		System.out.println("enter the element to array ");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(i=0;i<n-1;i++)
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
					arr[j]=99999;//Keep one largest value
			}
		for(i=0;i<n;i++)
		{
			if(arr[i] != 99999)
				ar[k++]=arr[i];
		}
		System.out.println("the array after removing duplication is ");
		for(i=0;i<k;i++)
			System.out.print(ar[i] +"  ");
	}
}
