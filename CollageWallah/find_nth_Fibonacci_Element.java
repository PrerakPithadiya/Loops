import java.util.Scanner;
public class find_nth_Fibonacci_Element{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of terms : ");
		int n = sc.nextInt();
		int fibElement = findNthFibonacci(n);
		if(n == 1){
			System.out.println("The '1st' Fibonacci Element is : " + fibElement);
		} else if(n == 2){
			System.out.println("The '2nd' Fibonacci Element is : " + fibElement);
		} else if(n == 3){
			System.out.println("The '3rd' Fibonacci Element is : " + fibElement);
		} else{
			System.out.println("The '" + n + "th' Fibonacci Element is : " + fibElement);
		}
	}
	public static int findNthFibonacci(int n){
		if(n == 1){
			return 1;
		} else if(n == 2){
			return 1;
		} else if(n == 3){
			return 2;
		} 
		int a, b, c;
		a = b = c = 1;
		for(int i = 1; i <= n - 2; i++){
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}