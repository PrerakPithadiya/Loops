import java.util.*;
public class Print_N_Numbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println("\nThe Numbers from '1' to '" + n + "' is : ");
		printNumbers(n);
	}
	public static void printNumbers(int n){
		for(int i = 1; i <= n; i++){ System.out.print(i + " "); }
		System.out.println();
	}
}