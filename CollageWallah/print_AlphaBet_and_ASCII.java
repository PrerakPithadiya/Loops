import java.util.Scanner;
public class print_AlphaBet_and_ASCII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Alphabet (in UpperCase) : ");
		char ch = sc.next().trim().charAt(0);

		System.out.println("\nThe AlphaBets & It's ASCII Values are : ");
		printASCIIandAlphaBet(ch);
	}
	public static void printASCIIandAlphaBet(char ch){
		int a = 65;
		while(a <= (int)ch){
			System.out.println((char)a + " -> " + a);
			a++;
		}
	}
}