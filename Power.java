import java.util.Scanner;

public class Power {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number: ");      
       int num1 = scanner.nextInt();

       System.out.println("Enter the power of that number:");
       int num2 = scanner.nextInt();

       int power = 1;
       
       if (num2 >= 1) {
           for (int i = 1; i <= num2; i++) {
               power = power * num1;
           }
           System.out.println(""+num1+" power "+num2+" is =  "+power);
       }

   }

}