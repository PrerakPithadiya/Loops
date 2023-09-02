import java.util.Scanner;
public class find_Factorial_of_First_n_Numbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println("\nThe Factorials upto '" + n + "' are : ");
		findFactorialuptoN(n);
	}
	public static void findFactorialuptoN(int n){
		int fac = 1;
		for(int i = 1; i <= n; i++){
			fac *= i;
			System.out.println("The Factorial of '" + i + "' is : " + fac);
		}
	}
}