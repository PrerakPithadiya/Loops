import java.util.Scanner;
public class HCF_of_Two{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int num2 = sc.nextInt();

		int result = calculatorHCF(num1, num2);
		System.out.println("The HCF of '" + num1 + "' & '" + num2 + "' is : " + result);
	}
	public static int calculatorHCF(int a, int b){
		while(a != 0 && b != 0){
			if(a > b){
				a = a % b;
			} else{
				b = b % a;
			}
		}
		if(a == 0){ return b; }
		else{ return a; }
	}
}