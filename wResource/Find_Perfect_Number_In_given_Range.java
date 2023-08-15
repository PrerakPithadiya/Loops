import java.util.Scanner;
import java.util.ArrayList;
public class Find_Perfect_Number_In_given_Range{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Start Range : ");
		int start = sc.nextInt();
		System.out.print("Enter the End Range : ");
		int end = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		findPerfects(start, end, list);
		int size = list.size();
		if(size == 0){
			System.out.println("There isn't any Perfect Number in given Range!");
		} else if(size == 1){
			System.out.println("The Perfect Number in given Range is : " + list.get(0));
		} else{
			System.out.println("The Perfect Numbers in given Range are : " + list);
		}
	}
	public static void findPerfects(int start, int end, ArrayList<Integer> list){
		for(int i = start; i <= end; i++){
			if(isPerfect(i)){
				list.add(i);
			}
		}
	}
	public static boolean isPerfect(int n){
		int sum = 0;
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				sum += i;
			}
		}
		return sum == n;
	}
}