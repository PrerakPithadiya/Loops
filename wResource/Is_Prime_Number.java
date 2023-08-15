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
		for(int i = 2; i <= n - 1; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}