import java.util.Scanner;
public class Print_Fibonacci_Series{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Terms : ");
		int n = sc.nextInt();
		System.out.print("Fibonacci Series is : ");
		printFibonacci(n);
	}
	public static void printFibonacci(int n){
		int a = 0, b = 1, c = -1;
		if(n == 0){
			System.out.println("[]");
		} else if(n == 1){
			System.out.println("[0]");
		} else if(n == 2){
			System.out.println("[0, 1]");
		} else{
			System.out.print("[0, 1, ");
			for(int i = 1; i <= n - 2; i++){
				c = a + b;
				System.out.print(c);
				if(i < n - 2){ System.out.print(", "); }
				a = b;
				b = c;
			} System.out.println("]");
		}
	}
}