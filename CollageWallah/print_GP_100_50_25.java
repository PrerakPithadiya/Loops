import java.util.Scanner;
public class print_GP_100_50_25{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		printGivenGP(n);
	}
	public static void printGivenGP(int n){
		System.out.print("\nThe given GP upto '" + n + "' terms is : \nGP : [");
		float a = 100f;
		for(int i = 1; i <= n; i++){
			System.out.print(a);
			a /= 2;
			if(i < n){ System.out.print(", "); }
		} 
		System.out.println("]");
	}
}