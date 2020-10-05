/* WAP TO SORT A ARRAY */

class SortArray
{
	public static void main(String args[])
	{
		int arr[]= new int[30];
		int i,ele,n,index,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		n = sc.nextInt();
		System.out.println("enter the element to array ");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("the element in sorted order are");
		
		for(i=0;i<=n-1;i++)
		{
			index=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[index] >arr[j])
				index=j;
			}
			ele = arr[i];
			arr[i]=arr[index];
			arr[index]=ele;
		}
        for(k=0;k<n;k++)
			System.out.print(arr[k] + "  ");
	}
}
