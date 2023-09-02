import java.util.Random;
public class find_Sum_of_Even_Digits{
	public static void main(String[] args){
		Random rd = new Random();
		int num = rd.nextInt(1000000);
		System.out.println("The Number is : " + num);
		int result = findEvenDigitsSum(num);
		System.out.println("The Even Digits Sum is : " + result);
	}
	public static int findEvenDigitsSum(int n){
		int sum, r;
		sum = r = 0;
		System.out.print("The Even Digits are : [ ");
		while(n != 0){
			r = n % 10;
			if(r % 2 == 0){ System.out.print(r + " "); sum += r; }
			n /= 10;
		} System.out.println("]");
		return sum;
	}
}