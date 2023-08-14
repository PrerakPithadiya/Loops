import java.util.Scanner;
public class Find_N_Even_Numbers_and_Its_Sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.print("The First '" + n + "' Even Numbers are : ");
		int evensSum = printAndFindEvens(n);
		System.out.println("The Sum of First '" + n + "' Even Numbers is : " + evensSum);
	}
	public static int printAndFindEvens(int n){
		int evenSum = 0, a = 2;
		System.out.print("[");
		while(n != 0){
			evenSum += a;
			System.out.print(a);
			if(n != 1){ System.out.print(", "); }
			a += 2;
			n--;
		} System.out.println("]");
		return evenSum;
	}
}