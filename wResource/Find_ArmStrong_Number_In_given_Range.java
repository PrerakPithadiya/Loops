import java.util.Scanner;
import java.util.ArrayList;
public class Find_ArmStrong_Number_In_given_Range{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Start Range : ");
		int start = sc.nextInt();
		System.out.print("Enter the End Range : ");
		int end = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		findArmStrongs(start, end, list);
		int size = list.size();
		if(size == 0){
			System.out.println("There isn't any ArmStrong Number is given Range!");
		} else if(size == 1){
			System.out.println("The ArmStrong Number in given Range is : " + list);
		} else{
			System.out.println("The ArmStrong Numbers in given Range are : " + list);
		}
	}
	public static void findArmStrongs(int start, int end, ArrayList<Integer> list){
		StringBuilder sb = new StringBuilder();
		for(int i = start; i <= end; i++){
			if(isArmStrong(i)){
				list.add(i);
			}
		}
	}
	public static boolean isArmStrong(int num){
		String str = Integer.toString(num);
		int n = str.length(), temp = num, x = 0;
		long sum = 0;
		while(num > 0){
			x = num % 10;
			sum += (int)Math.pow(x, n);
			num /= 10;
		}
		return sum == temp;
	}
}