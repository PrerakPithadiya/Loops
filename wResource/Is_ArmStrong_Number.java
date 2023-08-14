import java.util.Scanner;
public class Is_ArmStrong_Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		if(isArmStrong(n)){
			System.out.println(" = " + n);
			System.out.println("Result : The given Number '" + n + "' is ArmStrong!");
		} else{
			System.out.println(" != " + n);
			System.out.println("Result : The given Number '" + n + "' isn't ArmStrong!");
		}
	}
	public static boolean isArmStrong(int num){
		String str = Integer.toString(num);
		int x = 0, index = 0;
		long sum = 0, n = str.length(), temp = num;
		System.out.print("Calculation : [");
		while(num > 0){
			System.out.print(str.charAt(index) + "^" + n);
			if(index < n - 1){ System.out.print(" + "); }
			x = num % 10;
			sum += ((long)Math.pow(x, n));
			num /= 10;
			index++;
		} System.out.print("]");
		return sum == temp;
	}
}