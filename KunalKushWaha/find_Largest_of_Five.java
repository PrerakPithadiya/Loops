import java.util.Random;
public class find_Largest_of_Five{
	public static void main(String[] args){
		Random rd = new Random();
		int a = rd.nextInt(1000), b = rd.nextInt(1000);
		int c = rd.nextInt(1000), d = rd.nextInt(1000);
		int e = rd.nextInt(1000);

		System.out.println("Five Numbers are : [" + a + ", " + b + ", " + c + ", " + d + ", " + e + "]");

		int maxNum = findMax(a, b, c, d, e);
		System.out.println("\nThe Maximum Number is : " + maxNum);
	}
	public static int findMax(int a, int b, int c, int d, int e){
		return Math.max(Math.max(Math.max(a, b), Math.max(c, d)), e);
	}
}