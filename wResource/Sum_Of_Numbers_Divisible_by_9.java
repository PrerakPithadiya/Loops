import java.util.Scanner;
import java.util.ArrayList;
public class Sum_Of_Numbers_Divisible_by_9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Start Range : ");
		int start = sc.nextInt();
		System.out.print("Enter the End Range : ");
		int end = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		long integersSum = findIntegersSum(start, end, list);
		int size = list.size();
		if(size == 0){
			System.out.println("There isn't any Number in given Range which is Divisible By '9'");
		} else if(size == 1){
			System.out.println("The Number in given Range which Divisible by '9' is : " + list.get(0));
		} else{
			System.out.println("The Numbers in given Range which Divisible by '9' are : " + list);
		}
		System.out.println("The Sum of Numbers is : " + integersSum);
	}
	public static long findIntegersSum(int start, int end, ArrayList<Integer> list){
		long sum = 0;
		for(int i = start; i <= end; i++){
			if(i % 9 == 0){
				sum += i;
				list.add(i);
			}
		}
		return sum;
	}
}