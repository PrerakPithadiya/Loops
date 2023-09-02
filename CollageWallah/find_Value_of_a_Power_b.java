import java.util.Scanner;
public class find_Value_of_a_Power_b{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Format is : a ^ b");
		System.out.print("Enter the Value of 'a' : ");
		int a = sc.nextInt();
		System.out.print("Enter the Value of 'b' : ");
		int b = sc.nextInt();
		long aPower = findPowerofA(a, b);
		System.out.println("Result of '" + a + "^" + b + "' is : " + aPower);
	}
	public static long findPowerofA(int n, int b){
		if(n == 1 || b == 0){ return 1; }
		long a = n, x = a;
		for(int i = 1; i < b; i++){
			a = a * x;
		}
		return a;
	}
}