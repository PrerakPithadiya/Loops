import java.util.Random;
public class find_Sum_of_OrgNo_and_RevNo{
	public static void main(String[] args){
		Random rd = new Random();
		int orgNum = rd.nextInt(100000);
		System.out.println("The Original Number is : " + orgNum);
		int revNum = reverseNumber(orgNum);
		System.out.println("The Reversed Number is : " + revNum);
		int result = orgNum + revNum;
		System.out.println("The Sum of Both Number is : " + result);
	}
	public static int reverseNumber(int n){
		int rev, r;
		rev = r = 0;
		while(n != 0){
			r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		return rev;
	}
}