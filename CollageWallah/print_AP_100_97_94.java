import java.util.Scanner;
public class print_AP_100_97_94{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		printGivenAP(n);
	}
	public static void printGivenAP(int n){
		System.out.print("\nThe All Positive terms of given AP is : \nAP : ");
		System.out.print("[ ");
		for(int i = n; i > 0; i -= 3){
			System.out.print(i + " ");
		}
		System.out.println("]");
	}
}