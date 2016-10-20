package fcu.iecs.oop;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		int num;
		float a;
		String str,str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a int:");
		num = sc.nextInt();
		System.out.println("Enter a float:");
		a=sc.nextFloat();
		System.out.println("Enter your name:");
		str=sc.next();
		str2 = "Hi %s,the multiplication of %d and %f is %.2e";
		
		System.out.printf(str2,str,num,a,num*a);
		}

}
