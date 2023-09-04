import java.util.Scanner;
public class Factorial_of_Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		long fact = findFactorial(n);
		System.out.println("The Factorial of '" + n + "' is : " + fact);
	}
	public static long findFactorial(int n){
		long fact = 1;
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
		return fact;
	}
}