import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
	
		
		System.out.println("1:Addition \n2: exit");
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the option");
		
		int option,sum,num1,num2;
		option=scanner.nextInt();
		char ch ;
        
	
		switch(option){
		case 1:
		    System.out.println("Adding customer");
			do {
			    System.out.println("Enter the first number:");		
				num1=scanner.nextInt();
		        System.out.println("Enter the second number:");
		        num2=scanner.nextInt();
                sum = num1+num2;
                System.out.println("Sum:" +sum);
		
		        System.out.println("Do you want to continue with options press yes else press no");		
		        ch=scanner.next().charAt(0);	
			}
			while( ch=='y'||  ch=='Y');
			System.out.println("You have entered wrong");
			
		case 2: System.exit(0);
	
		    
			default:System.out.println("Enter only 1 , 2 ");
		    break;
		
		}	
		}
	}
	

