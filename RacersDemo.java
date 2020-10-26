import java.util.Scanner;
class RacersDemo
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int speeds[]=new int[5];
	  double totalspeeds=0;
	  System.out.print("Enter the speeds");
	  for(int i=0;i<speeds.length;i++)
	    {
	      System.out.println("\nspeed of["+i+"]racer is:");
	      speeds[i]=sc.nextInt();
	      totalspeeds=totalspeeds+speeds[i];
	    }
	  double avg=totalspeeds/5;
	  System.out.println("avgspeed"+avg);
	  System.out.println("speeds with qualified races ");
	for(int i=0;i<speeds.length;i++)
	{
	  if(speeds[i]>avg)
	  {
	    System.out.println("Biker no"+i+",speed:"+speeds[i]);
	  }
	}
	System.out.println();
  }
}  	   
	      
