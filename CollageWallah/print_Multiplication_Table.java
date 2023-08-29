import java.util.Scanner;
public class print_Multiplication_Table{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.print("Enter Start Range : ");
		int startRange = sc.nextInt();
		System.out.print("Enter End Range : ");
		int endRange = sc.nextInt();
		printTableSeries(n, startRange, endRange);
		printTableFormat(n, startRange, endRange);
	}
	public static void printTableFormat(int n, int start, int end){
		System.out.println("\nMultiplication Table Format of '" + n + "' is : ");
		for(int i = start; i <= end; i++){
			System.out.println("[" + n + " * " + i + " = " + (n * i) + "]");
		}
	}
	public static void printTableSeries(int n, int start, int end){
		System.out.println("\nMultiplication Table Series of '" + n + "' is : ");
		System.out.print("[");
		for(int i = n * start; i <= n * end; i += n){
			System.out.print(i);
			if(i != n * end){ System.out.print(", "); }
		}
		System.out.println("]");

	}
}