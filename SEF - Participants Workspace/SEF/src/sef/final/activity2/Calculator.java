import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {
    static Scanner reader = new Scanner(System.in);
    public static double getSum(double a, double b){
        double sum= a + b;
        return sum;
    }
    public static double getDif(double a, double b){
        double dif= a - b;
        return dif;
    }
    public static double getProduct(double a, double b){
        double prod= a * b;
        return prod;
    }
    public static double getDivided(double a, double b){
        double res= a / b;
        return res;
    }
    public static void main(String[] args) {


        System.out.print("Enter first number: ");

        double first= getNumber();


        System.out.print("Enter second number: ");
        double second=getNumber();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result=getSum(first,second);
                break;

            case '-':
                result=getDif(first,second);
                break;

            case '*':
                result=getProduct(first,second);
                break;

            case '/':
                result=getDivided(first,second);
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.println(first + " " + operator + " " + second + " = " + result);
    }
    public static double getNumber() {
        //this catch block accepts only numbers as input, in other cases prompts an error and ask user to enter a number
        while (true) {
            try {
                return reader.nextDouble();
            } catch (InputMismatchException a) {
                reader.next();
                System.out.println("Error, input was not a number! Enter a number");
            }
        }
    }
}
