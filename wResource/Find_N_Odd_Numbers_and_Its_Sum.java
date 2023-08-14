import java.util.Scanner;
public class Find_N_Odd_Numbers_and_Its_Sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println("The First '" + n + "' Odd Numbers are : ");
		int oddSum = printOdds(n);
		System.out.println("The Sum of First '" + n + "' Odd Numbers are : " + oddSum);
	}
	public static int printOdds(int n){
		int sum = 0, a = 1;
		System.out.print("[");
		while(n != 0){
			sum += a;
			System.out.print(a);
			if(n != 1){ System.out.print(", "); }
			a += 2;
			n--;
		} System.out.println("]");
		return sum;
	}
}