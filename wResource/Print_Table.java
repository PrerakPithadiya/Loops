import java.util.Scanner;
public class Print_Table{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.print("Enter Start Range : ");
		int start = sc.nextInt();
		System.out.print("Enter End Range : ");
		int end = sc.nextInt();
		System.out.println("The Multiplication Table of '" + n + "' from " + start + " to " + end + " is : ");
		printTable(n, start, end);
	}
	public static void printTable(int n, int start, int end){
		for(int i = start; i <= end; i++){
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
}