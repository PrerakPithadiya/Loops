import java.util.Random;
public class find_Sum_of_Digits{
	public static void main(String[] args){
		Random rd = new Random();
		int num = rd.nextInt(100000);
		System.out.println("The Number is : " + num);
		int result = findSumOfDigits(num);
		System.out.println("The Sum of Digits is : " + result);

	}
	public static int findSumOfDigits(int n){
		int sum = 0, r = 0;
		while(n != 0){
			r = n % 10;
			sum += r;
			n /= 10;
		}
		return sum;
	}
}