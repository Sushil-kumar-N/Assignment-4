import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {

	  Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number:");   
		int num= scanner.nextInt();
        int  reversed = 0;
    
    System.out.println("Original Number: " + num);

    while(num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}