import java.util.Scanner;
class SmallLargeDemo{
	public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the numnber of elements:");
	  int size =sc.nextInt();
	  int arr[]=new int[size];
	  System.out.println("Enter the elements:");
	  for(int i=0;i<arr.length;i++){
	    System.out.print("arr["+i+"]:");
	    arr[i]=sc.nextInt();
	    }
	  int max,min;
	  max=min=arr[0];
	  for(int i=1;i<arr.length;i++){
	    if(arr[i]>max)max=arr[i];
	    if(arr[i]<min)min=arr[i];
	    }
	  System.out.println("Largest Element:"+max);
	  System.out.println("Smallest Element:"+min);
	}
}