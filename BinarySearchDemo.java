import java.lang.*;
import java.util.Scanner;
class BinarySearchDemo
{
	public static int bsearch(int ar[],int find)
	{
		int start=0,end=ar.length-1,mid;
		while(start<=end){
			mid=(start+end)/2;
		  if(ar[mid]==find){
		    return mid;
		  }else if(ar[mid]<find){
		    start=mid+1;
		  }else if(ar[mid]>find){
		    start=mid-1;
		  }
		}//end of while
		return -1;
	}
	public static void main(String args[])
	{
		int arr[];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements for binary search :");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.print("Enter the  elements in ascending order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
                System.out.println("Enter the element to be serached");
		int key=sc.nextInt();
		int index=bsearch(arr,key);
		if(index!=-1)
                System.out.println("Element is found at:"+index);
		else
                System.out.println("Element not found");
		//End of the main function
	}
}	