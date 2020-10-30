public class StringBufferDeleteDemo {
	public static void main(String[] args){
		StringBuffer sb1= new StringBuffer("Hello world");
		System.out.println("The string is :"+sb1);
		sb1.delete(0,6);
		System.out.println("After deleting characters from o to 5 ");
		System.out.println("the resulted string is :"+sb1);

		StringBuffer sb2= new StringBuffer("Hello good morning");
		System.out.println("The string is :"+sb2);
		sb2.delete(11,15);
		System.out.println("After deleting the substring \"morn\": ");
		System.out.println("the resulted string is :"+sb2);
		
		StringBuffer sb3= new StringBuffer("Have a nice day");
		System.out.println("The string is :"+sb3);
		sb3.deleteCharAt(8);
		System.out.println("After deleting character at index 8 ");
		System.out.println("the resulted string is :"+sb3);
	}
}