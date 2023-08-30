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
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}