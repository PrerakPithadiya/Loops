import java.util.Scanner;
public class print_GP_3_12_48{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		printGivenGP(n);
	}
	public static void printGivenGP(int n){
		System.out.print("\nThe GP upto '" + n + "' terms is : \nGP : ");
		int a = 3;
		System.out.print("[");
		for(int i = 1; i <= n; i++){
			System.out.print(a);
			a *= 4;
			if(i != n){ System.out.print(", "); }
		}
		System.out.println("]");
	}
}