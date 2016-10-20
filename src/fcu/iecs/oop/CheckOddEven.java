package fcu.iecs.oop;
import java.util.Scanner;
public class CheckOddEven {
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a int:");
		num= sc.nextInt();
		if(num%2==1)
			System.out.println("The input integer is odd Number.");
		else
			System.out.println("The input integer is even Number.");
		
		
	}
}
