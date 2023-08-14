import java.util.Scanner;
public class Calculate_Value_Of_Series{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// System.out.print("Enter the Number : ");
		// int n = sc.nextInt();
		// System.out.print("Series is : ");
		// float seriesSum = calculateSeriesValue(n);
		// System.out.println("The Sum of Series is : " + seriesSum);
		// long nineSeriesValue = valueOfNineSeries(n);
		// System.out.println("The Sum of Series is : " + nineSeriesValue);
		// System.out.print("Enter the Value of 'x' : ");
		// int x = sc.nextInt();
		// System.out.print("Enter the Number of Terms : ");
		// int n = sc.nextInt();
		// System.out.print("Series is : ");
		// long result = valueOfPowerSeries(x, n);
		// System.out.println("The Sum of Series is : " + result);
		System.out.print("Enter the Number of Terms : ");
		int n = sc.nextInt();
		System.out.print("Series is : ");
		long result;
		// result = valueOfSquareSeries(n);
		result = valueOfOnesSeries(n);
		System.out.println("The Sum of Series is : " + result);
	}
	public static long valueOfOnesSeries(int n){
		long a = 1, sum = 0, val = 1;
		System.out.print("[");
		while(n != 0){
			System.out.print(a);
			if(n != 1){ System.out.print(", "); }
			sum += a;
			val *= 10;
			a += val;
			n--;
		} System.out.println("]");
		return sum;
	}
	public static long valueOfSquareSeries(int n){
		int a = 1, res = 0;
		long sum = 0;
		System.out.print("[");
		while(n != 0){
			res = a * a;
			System.out.print(res);
			if(n != 1){ System.out.print(", "); }
			sum += res;
			a++;
			n--;
		} System.out.println("]");
		return sum;
	}
	public static long valueOfPowerSeries(int x, int terms){
		if(x == 0){ System.out.println("[0]"); return 0; }
		long res = 0, sum = 0, index = 1, n = 1; 
		System.out.print("[");
		while(terms != 0){
			res = (long)Math.pow(x, n);
			if(index % 2 != 0){ sum += res; if(index != 1){ System.out.print(" + "); } }
			else{ sum -= res; System.out.print(" - "); }
			System.out.print("x^" + n);
			n += 2;
			index++;
			terms--;
		} System.out.println("]");
		return sum;
	}
	public static long valueOfNineSeries(int n){
		long sum = 0, a = 9, val = 9;
		System.out.print("[");
		while(n != 0){
			System.out.print(a);
			if(n != 1){ System.out.print(", "); }
			sum += a;
			val *= 10;
			a += val;
			n--;
		} System.out.println("]");
		return sum;
	}
	public static float calculateSeriesValue(int n){
		float result = 0;
		System.out.print("[");
		for(int i = 1; i <= n; i++){ 
			System.out.print("1/" + i);
			if(i != n){ System.out.print(", "); }
			result += (float)(1.0f / i); 
		} System.out.println("]");
		return result;
	}
}