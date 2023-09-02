import java.util.Random;
public class check_AlphaBet_Case{
	public static void main(String[] args){
		Random rd = new Random();

		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		char ranChar = str.charAt(rd.nextInt(str.length()));

		System.out.println("The Character is : " + ranChar);

		String result = findCase(ranChar);
		System.out.println("\nThe given Alphabet is in : " + result);
	}
	public static String findCase(char ch){
		String letterCase;

		if(ch >= 'A' && ch <= 'Z'){
			letterCase = "UpperCase";
		} else{
			letterCase = "LowerCase";
		}

		return letterCase;
	}
}