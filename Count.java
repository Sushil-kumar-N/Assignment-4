import java.util.Scanner;


public class Count {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int number,countPositive = 0, countNegative = 0,countZero = 0;

        char ch;
	
        do
        {
            System.out.print("Enter the number ");
            number = scanner.nextInt();
        
            if(number > 0)
            {
                countPositive++;
            }
            else if(number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }
        
            System.out.print("Do you want to continue y/n? ");
            ch = scanner.next().charAt(0);
            
        }while(ch=='y' || ch == 'Y');
        
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }  
}