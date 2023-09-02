import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class find_Sum_of_Odd_Digits{
	public static void main(String[] args){
		Random rd = new Random();
		int num = rd.nextInt(1000000);
		System.out.println("The Number is : " + num);
		int result = findOddDigitsSum(num);
		System.out.println("The Even Digits Sum is : " + result);
	}
	public static int findOddDigitsSum(int n){
		int sum, r;
		sum = r = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		while(n != 0){
			r = n % 10;
			if(r % 2 != 0){
				arr.add(r);
				sum += r;
			}
			n /= 10;
		}
		Collections.reverse(arr);
		System.out.println("The Odd Digits are : " + arr);
		return sum;
	}
}