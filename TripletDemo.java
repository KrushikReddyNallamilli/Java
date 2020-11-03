import java.util.Scanner;
class TripletDemo{
	public static void main(String[] args){
	  int a,b,c;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the three number:");
	  a=sc.nextInt();
	  b=sc.nextInt();
	  c=sc.nextInt();
//test the conditions
	  boolean c1=(a*a+b*b)==c*c;
	  boolean c2=(b*b+c*c)==a*a;
	  boolean c3=(c*c+a*a)==b*b;
	  if(c1||c2||c3){
	    System.out.println("The 3 numbers are pythagorean triplet");
	  }else{
	    System.out.println("The 3 numbers are not pythagorean triplet");
	  }
	}
}