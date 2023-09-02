import java.util.Random;
public class countDigits{
	public static void main(String[] args){
		Random rd = new Random();
		int num = rd.nextInt(10);
		System.out.println("The Number is : " + num);
		int result = countNumberDigits(num);
		System.out.println("The Number of Digits is : " + result);
	}
	public static int countNumberDigits(int n){
		int count = 0;
		while(n != 0){
			count++;
			n /= 10;
		}
		return count;
	}
}