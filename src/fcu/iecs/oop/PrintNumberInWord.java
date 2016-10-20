package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a int:"); 
		num = sc.nextInt();
		
		
		 switch(num) { 
         case 10:
        	 System.out.println("TEN");
         case 9:
             System.out.println("NINE");
             break;
         case 8:
             System.out.println("EIGHT");
             break;
         case 7:
             System.out.println("SEVEN");
             break;
         case 6:
             System.out.println("SIX");
             break;
         case 5:
        	 System.out.println("FIVE");
        	 break;
         case 4:
        	 System.out.println("FOUR");
        	 break;
         case 3:
        	 System.out.println("THREE");
        	 break;
         case 2:
        	 System.out.println("TWO");
        	 break;
         case 1:
        	 System.out.println("ONE");
        	 break;
         default:
             System.out.println("OTHER");
		
             
		 }
		
	}
}
