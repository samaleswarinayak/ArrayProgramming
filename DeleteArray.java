/* WAP TO DELETE A ELEMENT IN A ARRAY BY INDEX OR BY VALUE USING SWITCH CASE*/

import java.util.*;
class DeleteArray
{
	public static void main(String args[])
	{
		int arr[]= new int[10];
		int i,val=0,n,index=0,value=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		n = sc.nextInt();
		System.out.println("enter the element to array ");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Do you want delete element by  index(press i) or by value(press v)");
		ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'i':
			case 'I':
			{
				System.out.println("enter the index ");
				index = sc.nextInt();
				if(index >n)
				{
					System.out.println("index out of range ");
					System.exit(0);
					
				}
				
				for(i=index-1;i<n-1;i++)
					arr[i]=arr[i+1];
				break;
			}
			case 'v':
			case 'V':
			{
				System.out.println("enter the value you want to delete ");
				val = sc.nextInt();
				for(i=0;i<n;i++)
					if(arr[i]==val)
					{
						index=i+1;
						break;
					}
				if(index==0)
				{
					System.out.println("element not found ");
					System.exit(0);
				}
				
				for(i=index-1;i<n-1;i++)
					arr[i]=arr[i+1];			
				break;
			}
				
			
		}
		if(ch == 'i' || ch =='I')
			System.out.println("the array after deleting the element at index " + index + " is");
		else
			System.out.println("the array after deleteing  value "+ val + " is");
		for(i=0;i<n-1;i++)
			System.out.print(arr[i] + "  ");
	}
					
}
