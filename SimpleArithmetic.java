import java.util.Scanner;

public class SimpleArithmetic {

    public static void main(String[] args) 
    {
        double num1;
        double num2; 
        double result;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter a mathematical operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        


        switch(operator)
        {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;
            
            case '*': 
                result = num1 * num2;
                break;
            
            case '/':
                result = num1 / num2;
                break;
            
            default: 
                System.out.printf("Invalid operator entered.");
                return;

        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

     }
    
}