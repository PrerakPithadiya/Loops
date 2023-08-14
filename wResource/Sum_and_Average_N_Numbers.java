import java.util.Scanner;
import java.util.Random;
public class Sum_and_Average_N_Numbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.print("Random Numbers are : ");
		int sum = generateRandomNumbers(n);
		float avg = (float)sum / n;
		System.out.println("The Sum of All Numbers is : " + sum);
		System.out.println("The Average of All Numbers is : " + avg);
	}
	public static int generateRandomNumbers(int n){
		Random rd = new Random();
		int sum = 0, num;
		while(n != 0){
			num = rd.nextInt(1, 100);
			sum += num;
			System.out.print(num + " ");
			n--;
		} System.out.println();
		return sum;
	}
}