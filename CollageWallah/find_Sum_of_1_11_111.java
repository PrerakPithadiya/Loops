import java.util.Scanner;
public class find_Sum_of_1_11_111{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value : ");
		int val = sc.nextInt();
		System.out.print("Enter the Number of terms : ");
		int n = sc.nextInt();
		printSeries(n, val);
	}
	public static void printSeries(int n, int val){
		System.out.print("\nThe Numerical Series is : \n[");
		long a = val * 10, sum = 0;
		for(int i = 1; i <= n; i++){
			sum += val;
			System.out.print(val);
			if(i < n){ System.out.print(", "); }
			val += a;
			a *= 10;
		}
		System.out.println("]");

		System.out.println("\nThe Sum of Series is : " + sum);
	}
}