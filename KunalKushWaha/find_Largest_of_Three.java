import java.util.Random;
public class find_Largest_of_Three{
	public static void main(String[] args){
		Random rd = new Random();
		int a = rd.nextInt(1000);
		int b = rd.nextInt(1000);
		int c = rd.nextInt(1000);

		System.out.println("Three Numbers are : [" + a + ", " + b + ", " + c + "]");

		int maxNum = findMax(a, b, c);
		System.out.println("\nThe Maximum Number is : " + maxNum);
	}
	public static int findMax(int a, int b, int c){
		return Math.max(Math.max(a, b), c);
	}
}