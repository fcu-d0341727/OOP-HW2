package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {
	public static void main(String[] args){
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a string1:");
			str1= sc.next();
			System.out.println("Enter a string2:");
			str2= sc.next();
			int result = str1.compareToIgnoreCase(str2);
		
			if(result==0)
			{
				System.out.println("The two strings are the same");
				break;
			}
			else
				System.out.println("The two strings are not the same");
		}
		

	}


	

}
