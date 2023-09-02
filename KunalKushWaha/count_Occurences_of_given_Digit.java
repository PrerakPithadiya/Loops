import java.util.Random;
import java.util.Scanner;
public class count_Occurences_of_given_Digit{
	public static void main(String[] args){
		Random rd = new Random();

		long num = rd.nextLong(1_00_00_00_000);
		System.out.println("The Number is : " + num);

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the Digit : ");
		int digit = sc.nextInt();

		int occDigit = countOccurencesOfDigit(num, digit);
		System.out.println("The Occurences of '" + digit + "' is : " + occDigit);
	}
	public static int countOccurencesOfDigit(long n, int x){
		long r = -1;
		int count = 0;
		while(n != 0){
			r = n % 10;
			if(r == x){ count++; }
			n /= 10;
		}
		return count;
	}
}