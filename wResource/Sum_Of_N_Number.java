import java.util.Scanner;
public class Sum_Of_N_Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int sum = findNumbersSum(n);
		int sum2 = findSum(n);
		System.out.println("The Sum from '1' to '" + n + "' is : " + sum);
		// System.out.println(sum);
		// System.out.println(sum2);
		// System.out.println("Check Result : " + (sum == sum2));
	}
	public static int findNumbersSum(int n){ return (n * (n + 1)) / 2; }
	public static int findSum(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		return sum;
	}
}