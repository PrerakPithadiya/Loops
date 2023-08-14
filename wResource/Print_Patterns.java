import java.util.Scanner;
public class Print_Patterns{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int n = sc.nextInt();
		System.out.println("The Pattern is : ");
		// printSimpleTriangle(n);
		// printNumericalTriangle(n);
		// printNumberRowTriangle(n);
		// printContinueNumberTriangle(n);
		// printStarTriangle(n);
		// printRowNumberTriangle(n);
		// printPyramid(n);
		printFloydTriangle(n);
	}
	public static void printFloydTriangle(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				if((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)){ System.out.print("1 "); }
				else{ System.out.print("0 "); }
			} System.out.println();
		}
	}
	public static void printPyramid(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i; j++){
				System.out.print("  ");
			}
			for(int j = 1; j <= 2 * i - 1; j++){
				System.out.print("* ");
			} System.out.println();
		}
	}
	public static void printRowNumberTriangle(int n){
		int a = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(a + " ");
			} a++; System.out.println();
		}
	}
	public static void printStarTriangle(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			} System.out.println();
		}
	}
	public static void printContinueNumberTriangle(int n){
		int a = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(a++ + " ");
			} System.out.println();
		}
	}
	public static void printNumberRowTriangle(int n){
		int a = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(a + " ");
			} a++; System.out.println();
		}
	}
	public static void printNumericalTriangle(int n){
		for(int i = 1; i <= n; i++){
			int a = 1;
			for(int j = 1; j <= i; j++){
				System.out.print(a++ + " ");
			} System.out.println();
		}
	}
	public static void printSimpleTriangle(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			} System.out.println();
		}
	}
}