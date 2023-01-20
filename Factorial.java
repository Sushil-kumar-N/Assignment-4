import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[]) {
    
		int num, i, f=1;

   
		System.out.println("Enter an integer to calculate its factorial");    
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		if (num < 0)    
			System.out.println("Number should be non-negative.");
   
		else {
			for (i = 1; i <= num; i++)//1 1<=4 
				f = f*i; 
			System.out.println("Factorial of "+num+" is = "+f); 
		}
  
	}
}