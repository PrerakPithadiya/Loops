import java.util.Scanner;
public class Find_Factorial_Of_N_Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		long factorial = findFactorial(n);
		System.out.println("The Factorial of '" + n + "' is : " + factorial);
	}
	public static long findFactorial(int n){
		long factorial = 1;
		System.out.print("Factorial Process : [");
		for(int i = 1; i <= n; i++){
			System.out.print(i);
			if(i != n){ System.out.print(" * "); }
			factorial *= i; 
		} System.out.println("]");
		return factorial;
	}
}