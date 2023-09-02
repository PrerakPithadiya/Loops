import java.util.Scanner;
public class print_Fibonacci_Series{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of terms : ");
		int n = sc.nextInt();
		printFibonacci(n);
	}
	public static void printFibonacci(int n){
		int a = 1, b = 1, c = 1;
		if(n == 1){
			System.out.println("\nThe Fibonacci Series upto '1st' terms is : ");
			System.out.println("[1]");
			return;
		} else if(n == 2){
			System.out.println("\nThe Fibonacci Series upto '2nd' terms is : ");
			System.out.println("[1, 1]");
			return;
		} else if(n == 3){
			System.out.println("\nThe Fibonacci Series upto '3rd' terms is : ");
			System.out.println("[1, 1, 2]");
			return;
		}
		System.out.println("\nThe Fibonacci Series upto '" + n + "th' terms is : ");
		System.out.print("[" + a + ", " + b + ", ");
		for(int i = 1; i <= n - 2; i++){
			c = a + b;
			System.out.print(c);
			if(i < n - 2){ System.out.print(", "); }
			a = b;
			b = c;
		}
		System.out.println("]");
	}
}