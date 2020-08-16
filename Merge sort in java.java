import java.util.Scanner;
class MergeSort
{
	public static void sort(int[] a,int low,int high)
	{
	  int n=high-low;
	  if(n<=1)
	    return;
	  int mid=low+n/2;
	  //recursively sort
	  sort(a,low,mid);
	  sort(a,mid,high);
	  //merge two sorted subarrys
	  int[]temp=new int[n];
	  int i=low,j=mid;
	  for(int k=0;k<n;k++)
	  {
	    if(i==mid)
		temp[k]=a[j++];
	    else if(j==high)
		temp[k]=a[i++];
	    else if(a[j]<a[i])
		temp[k]=a[j++];
	    else
		temp[k]=a[i++];
	 }
	  for (int k=0;k<n;k++)
		a[low+k]=temp[k];
	}
	public static void main(String args[])
	{
		int arr[];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n=sc.nextInt();
		arr=new int[n];
		 for(int i=0;i<arr.length;i++)
		{
			System.out.print("arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Unsorted Elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		sort(arr,0,n);
		System.out.println("\nsorted Elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println();
	}
}
