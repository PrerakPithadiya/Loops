import java.util.Random;
public class Reverse_The_Integer{
	public static void main(String[] args){
		Random rd = new Random();
		int orgNum = rd.nextInt(1000000);
		System.out.println("The Original Number is : " + orgNum);
		int revNum = reverseInteger(orgNum);
		System.out.println("The Reversed Number is : " + revNum);
	}
	public static int reverseInteger(int n){
		int rev, r;
		rev = r = 0;
		while(n != 0){
			r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		return rev;
	}
}