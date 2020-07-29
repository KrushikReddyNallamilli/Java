import java.util.Scanner;
class BubbleSort
{
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
		for (int i = 0; i < arr.length; i++)
		  {
		    for (int j = 1; j <arr.length; j++)
		    {
                	if (arr[j-1] > arr[j])
                	{
                    	   // swap temp and arr[i]
                    	    int temp = arr[j-1];
	                    arr[j-1] = arr[j];
        	            arr[j] = temp;
			}
		    }
		  }
		System.out.println("\nsorted Elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println();
	}
}
        




/*Scanner scan=new Scanner(System.in);
		System.out.print("Merge sort test");
		int size i;*/
