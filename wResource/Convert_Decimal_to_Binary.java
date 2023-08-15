import java.util.Scanner;
import java.math.BigInteger;
public class Convert_Decimal_to_Binary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		BigInteger bi = new BigInteger(convertToBinary(num));
		System.out.println("The Binary Number of '" + num + "' is : " + bi);
	}
	public static String convertToBinary(int n){
		return Integer.toBinaryString(n);
	}
}