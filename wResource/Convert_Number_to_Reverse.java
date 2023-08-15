import java.util.Scanner;
public class Convert_Number_to_Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int reverseNo = convertToReverse(n);
		System.out.println("The Reversed Number is : " + reverseNo);
	}
	public static int convertToReverse(int n){
		int reverse = 0, r = 0;
		while(n > 0){
			r = n % 10;
			reverse = reverse * 10 + r;
			n /= 10;
		}
		return reverse;
	}
}