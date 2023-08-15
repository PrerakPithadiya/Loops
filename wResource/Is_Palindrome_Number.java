import java.util.Scanner;
public class Is_Palindrome_Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		if(isPalindrome2(n)){
			System.out.println("The given Number '" + n + "' is Palindromic!");
		} else{
			System.out.println("The given Number '" + n + "' isn't Palindromic!");
		}
	}
	public static boolean isPalindrome(int num){
		String str = Integer.toString(num);
		int i = 0, j = str.length() - 1;
		while(i < j){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static boolean isPalindrome2(int n){
		int rev = 0, r = 0, temp = n;
		while(n > 0){
			r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		return rev == temp;
	}
}