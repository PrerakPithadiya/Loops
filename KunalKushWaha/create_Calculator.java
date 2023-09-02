import java.util.Scanner;
public class create_Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the Operator : ");
		char operator = sc.next().trim().charAt(0);
		System.out.print("Enter the Second Number : ");
		double num2 = sc.nextDouble();

		double result = calculateExpression(num1, operator, num2);
		System.out.println("\nThe Result is : " + result);
	}
	public static double calculateExpression(double a, char ch, double b){
		switch(ch){
		case '+' : return a + b;
		case '-' : return a - b;
		case '*' : return a * b;
		case '/' : if(b == 0){ return Double.MIN_VALUE; } return a / b;
		case '%' : if(b == 0){ return Double.MIN_VALUE; } return a % b;
		default : return Double.MIN_VALUE;
		}
	}
}