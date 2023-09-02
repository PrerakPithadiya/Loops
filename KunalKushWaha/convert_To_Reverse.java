import java.util.Random;
public class convert_To_Reverse{
	public static void main(String[] args){
		Random rd = new Random();
		long num = rd.nextInt(1_00_00_00_000);
		System.out.println("The Original Number is : " + num);

		long rev = reverseTheNumber(num);
		System.out.println("The Reversed Number is : " + rev);
	}
	public static long reverseTheNumber(long n){
		long r, reverse;
		r = reverse = 0;
		while(n != 0){
			r = n % 10;
			reverse = reverse * 10 + r;
			n /= 10;
		}
		return reverse;
	}
}