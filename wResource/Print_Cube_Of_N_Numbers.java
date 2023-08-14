import java.util.Scanner;
public class Print_Cube_Of_N_Numbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println("The Cubes from 1 to " + n + " are : ");
		printCubes(n);
	}
	public static void printCubes(int n){
		for(int i = 1; i <= n; i++){
			System.out.println("Number is : " + i + " and Cube of " + i + " is : " + (i * i * i));
		}
	}
}