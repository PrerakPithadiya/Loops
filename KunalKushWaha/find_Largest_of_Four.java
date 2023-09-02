import java.util.Random;
public class find_Largest_of_Four{
	public static void main(String[] args){
		Random rd = new Random();
		int a = rd.nextInt(1000), b = rd.nextInt(1000);
		int c = rd.nextInt(1000), d = rd.nextInt(1000);

		System.out.println("Four Numbers are : [" + a + ", " + b + ", " + c + ", " + d + "]");

		int maxNum = findMax(a, b, c, d);
		System.out.println("\nThe Maximum Number is : " + maxNum);
	}
	public static int findMax(int a, int b, int c, int d){
		return Math.max(Math.max(a, b), Math.max(c, d));
	}
}