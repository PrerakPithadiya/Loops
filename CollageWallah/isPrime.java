import java.util.Scanner;
public class isPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		if(num == 1){ 
			System.out.println("The given Number is neither Prime nor Composite!"); 
			return; 
		}
		String result;
		if(isPrime(num)){
			result = "is";
		} else{
			result = "isn't";
		}
		System.out.println("Result is : The given Number " + result + " a Prime!");
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
