import java.util.Scanner;
import java.util.ArrayList;
public class Is_Perfect_Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		if(isPerfect(n, list)){ 
			System.out.println(" = " + n);
			System.out.println("Result : The given Number '" + n + "' is Perfect!"); 
		} else{
			System.out.println(" != " + n);
			System.out.println("Result : The given Number '" + n + "' isn't Perfect!");
		}
	}
	public static boolean isPerfect(int n, ArrayList<Integer> list){
		long sum = 0;
		for(int i = 1; i <= n - 1; i++){
			if(n % i == 0){ sum += i; list.add(i); }
		}
		System.out.print("Calculation : [");
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i));
			if(i < list.size() - 1){ System.out.print(" + "); }
		} System.out.print("]");
		// System.out.print("Calculation : " + list);
		return sum == n;
	}
}