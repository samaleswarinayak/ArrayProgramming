/* WAP TO FIND THE FREQUENCY OF EACH NUMBER IN THE ARRAY */

import java.util.*;
class FrequencyArray
{
	public static void main(String args[])
	{
		int arr[]= new int[10];
		int i,n,k=0,j,count,flag;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		n = sc.nextInt();
		System.out.println("enter the element to array ");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("The frequency of element in array are");
		for(i=0;i<n;i++)
		{
			flag=0;
			count = 0;
			for(k=0;k<i;k++)
				if(arr[k]==arr[i])
					flag=1;
			if(flag!=1)
			{
				for(j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
						count++;
				}
				System.out.println(arr[i] + ":" + (count+1));
			}
		}
	}
}
