/* WAP TO INSERT A NUMBER IN A ARRAY BY INDEX OR BY VALUE USING SWITCH CASE */

import java.util.*;
class InsertArray
{
	public static void main(String args[])
	{
		int arr[]= new int[20];
		int i,val=0,n,index=0,value=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		n = sc.nextInt();
		System.out.println("enter the element to array ");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Do you want to add element at index(press i) or after a value(press v)");
		ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'i':
			case 'I':
			{
				System.out.println("enter the index and value ");
				index = sc.nextInt();
				value = sc.nextInt();
				System.out.println("index:" + index);
				for(i=n-1;i>=index-1;i--)
					arr[i+1]=arr[i];
				arr[index-1]=value;
				break;
			}
			case 'v':
			case 'V':
			{
				System.out.println("enter the value after which you want to add and the value ");
				val = sc.nextInt();
				value = sc.nextInt();
				for(i=0;i<n;i++)
					if(arr[i]==val)
					{
						index=i;
						break;
					}
				for(i=n-1;i>=index+1;i--)
					arr[i+1]=arr[i];
				arr[index+1]=value;				
				break;
			}
				
			
		}
		if(ch == 'i' || ch =='I')
			System.out.println("the array after inserting the element at index " + index + " is");
		else
			System.out.println("the array after inserting element after the value "+ val + " is");
		for(i=0;i<=n;i++)
			System.out.print(arr[i] + "  ");
	}
					
}
