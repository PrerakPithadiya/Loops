import java.util.Scanner;
import java.util.ArrayList;
public class Find_Prime_Number_In_given_Range{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Start Range : ");
		int start = sc.nextInt();
		System.out.print("Enter the End Range : ");
		int end = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		findPrimes(start, end, list);
		int size = list.size();
		if(size == 0){
			System.out.println("There isn't any Prime Number in given Range!");
		} else if(size == 1){
			System.out.println("The Prime Number in given Range is : " + list.get(0));
		} else{
			System.out.println("The Prime Numbers in given Range are : " + list);
		}
	}
	public static void findPrimes(int start, int end, ArrayList<Integer> list){
		for(int i = start; i <= end; i++){
			if(isPrime(i)){
				list.add(i);
			}
		}
	}
	public static boolean isPrime(int n){
		for(int i = 2; i <= n - 2; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}