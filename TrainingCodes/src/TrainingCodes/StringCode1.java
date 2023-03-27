//Program to Reverse an String

package TrainingCodes;
import java.util.Scanner;

public class StringCode1 {

	public static void main(String[] args) {   //Main Method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.next();  //
		String s2 = "";
		
		for(int i=s1.length()-1; i>=0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("Reversed String is:"+s2);
	}
}
