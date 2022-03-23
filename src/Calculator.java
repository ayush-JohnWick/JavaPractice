import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        double num = reader.nextDouble();
        double num1 = reader.nextDouble();
        System.out.println("Please enter an operator (+ , - ,* ,/): ");
        char operator = reader.next().charAt(0);
        double result = 0;

        switch (operator) {
            case '+':
                result = num + num1;
                break;
            case '-':
                result = num - num1;
                break;
            case '*':
                result = num * num1;
                break;
            case '/':
                result = num / num1;
                break;

            default:
                System.out.println("Please enter correct operator");
                break;
        }
        System.out.println(result);
    }

}
