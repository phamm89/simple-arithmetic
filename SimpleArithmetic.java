import java.util.Scanner;

public class SimpleArithmetic {
/** User enters two integers and a mathematical operator. 
 *  Simple Arithmetic performs a calculation and displays the result.
 */
    public static void main(String[] args) 
    {
        double num1;
        double num2; 
        double result;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter a mathematical operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        /** Based on mathematical operator, switch to the corresponding case. */
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