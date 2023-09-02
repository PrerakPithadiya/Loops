import java.util.Scanner;
import java.lang.StringBuilder;
public class print_Series_1_12_123_1234{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of terms : ");
		int n = sc.nextInt();
		printSeries(n);
		printSeriesinOtherWay(n);
	}
	public static void printSeriesinOtherWay(int n){
		System.out.print("The given Series is : \n[");
		long val = 1, a = 11, b = 100;
		for(int i = 1; i <= n; i++){
			System.out.print(val);
			if(i < n){ System.out.print(", "); }
			val += a;
			a += b;
			b *= 10;
		} 
		System.out.println("]");
	}
	public static void printSeries(int n){
		int a = 1;
		System.out.print("\nThe given Series is : \n[");
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++){
			sb.append(a++);
			System.out.print(sb);
			if(i < n){ System.out.print(", "); }
		}
		System.out.println("]");
	}
}