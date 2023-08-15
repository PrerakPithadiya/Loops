import java.util.Scanner;
public class Convert_Binary_to_Decimal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Binary Number : ");
		long binary = sc.nextLong();
		int decimal = convertToDecimal(binary);
		System.out.println("The Decimal Number of '" + binary + "' is : " + decimal);
	}
	public static int convertToDecimal(long num){
		return Integer.parseInt(Long.toString(num), 2);
	}
}