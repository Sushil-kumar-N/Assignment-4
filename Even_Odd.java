import java.util.Scanner;

public class Even_Odd {
	
    public static void main(String []args) {
    	
        int sumOdd= 0;
        int sumEven= 0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter integers other then Zero: ");
        int num=scanner.nextInt();

        for (int i =num; i !=0; i=i)
                {
                    if (i % 2 == 0) {
                        sumEven = sumEven + i;
                        
                    System.out.println("Entered number is even: " + sumEven);
                    } else {
                        sumOdd = sumOdd + i;
                     System.out.println("Entered number is odd: " + sumOdd);}
                    i = scanner.nextInt();
                }
                
              
    }
}