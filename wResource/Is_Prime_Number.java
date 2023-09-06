import java.util.Scanner;
public class Is_Prime_Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.print("Result : ");
		if(isPrime(n)){
			System.out.println("The given Number '" + n + "' is Prime!");
		} else{
			System.out.println("The given Number '" + n + "' isn't Prime!");
		}
	}
	public static boolean isPrime(int n){
		if(n == 1){
			return false;
		}
		if(n == 2 || n == 3){
			return true;
		}
		if(n % 2 == 0 || n % 3 == 0){
			return false;
		}
		for(int i = 5; i * i <= n; i = i + 6){
			if(n % i == 0 || n % (i + 2) == 0){
				return false;
			}
		}
		return true;
	}
}
