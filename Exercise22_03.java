// The time complexity is O(n), and it can be found on line 16.
import java.util.*;

public class Exercise22_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string s1: ");
		String s1 = input.nextLine();
		System.out.println("Enter a string s2: ");
		String s2 = input.nextLine();
	
		int count = 0;
		int index = 0;
		
		for (int i = 0; i < s1.length(); i++) { // O(n)
			if (s1.charAt(i) == s2.charAt(0) && count == 0) {
				count++;
				index = i;
			}
			else if (s1.charAt(i) == s2.charAt(count)) {
				count++;
			}
			else {
				count = 0;
				index = 0;
			}
			
			if (s2.length() == count) {
				break;
			}
		}
		
		if (index > 1)
			System.out.println("Matched at index " + index);
			
		else
			System.out.println("No matched index found.");
	}
}