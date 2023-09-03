import java.util.Scanner;
public class Count_Trailing_Zeroes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		long fact = findFactorial(n);
		System.out.println("The Factorial of '" + n + "' is : " + fact);
		int count = countTrailingZeroes(fact);
		System.out.println("The Trailing Zeroes in '" + fact + "' are : " + count);
	}
	public static long findFactorial(int n){
		long fact = 1;
		for(int i = 2; i <= n; i++){
			fact *= i;
		}
		return fact;
	}
	public static int countTrailingZeroes(long n){
		long r = 0;
		int count = 0;
		while(n != 0){
			r = n % 10;
			if(r == 0){ count++; }
			else{ break; }
			n /= 10;
		}
		return count;
	}
}