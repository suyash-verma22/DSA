import java.util.Scanner;
class Algorithms{
	static Scanner scan = new Scanner(System.in);
	public static int convertBinaryToDecimal(String input){
		int n = input.length();
		int curr = 1;
		int ans = 0;
		for(int i=n-1;i>=0;i--){
			int val = Integer.parseInt(""+input.charAt(i));
			if(val == 1){
				ans += curr;
			}
			curr = curr*2;
		}
		return ans;
	}
	public static void main(String []args){
		System.out.print("Enter Binary Number: ");
		String input = scan.next();
		System.out.print("Decimal Number = " + convertBinaryToDecimal(input));
	}
}