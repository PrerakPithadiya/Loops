import java.util.Scanner;
public class find_Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		long factorial = findFactorial(n);
		System.out.println("The Factorial of '" + n + "' is : " + factorial);
	}
	public static long findFactorial(int n){
		int fac = 1;
		for(int i = 1; i <= n; i++){
			fac *= i;
		}
		return fac;
	}
}