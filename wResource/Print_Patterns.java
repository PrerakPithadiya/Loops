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
		// printFloydTriangle(n);
		// printDaimond(n);
		// printPascalsTriangle(n);
		printNumberHalfDaimond(n);
	}
	public static void printNumberHalfDaimond(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i; j++){
				System.out.print("  ");
			}
			int a = 1;
			for(int j = 1; j <= 2 * i - 1; j++){
				if(j <= (2 * i - 1) / 2){
					System.out.print(a++ + " ");
				} else{
					System.out.print(a-- + " ");
				}
			} System.out.println();
		}
	}
	public static void printPascalsTriangle(int n){
		int val = 0;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				if(i == 1 || j == 1){ val = 1; } 
				else{ val = val * (i - j + 1) / (j - 1); } 
				System.out.print(val + " ");
			} System.out.println();
		}
	}
	public static void printDaimond(int n){
		int nst = 1, nsp = n - 1;
		for(int i = 1; i <= 2 * n - 1; i++){
			for(int j = 1; j <= nsp; j++){
				System.out.print("  ");
			}
			for(int j = 1; j <= nst; j++){
				System.out.print("* ");
			}
			if(i < n){
				nsp -= 1;
				nst += 2;
			}
			else{
				nsp += 1;
				nst -= 2;
			} System.out.println();
		}
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
