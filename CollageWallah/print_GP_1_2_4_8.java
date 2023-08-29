import java.util.Scanner;
public class print_GP_1_2_4_8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		printGivenGP(n);
	}
	public static void printGivenGP(int n){
		System.out.println("\nThe GP upto '" + n + "' terms is : ");
		int a = 1;
		System.out.print("[");
		for(int i = 1; i <= n; i++){
			System.out.print(a);
			a *= 2;
			if(i != n){ System.out.print(", "); }
		}
		System.out.println("]");
	}
}