// The time complexity is O(n), and it can be found on line 14.
import java.util.*;

public class Exercise22_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		LinkedList<Character> link = new LinkedList<>();
		LinkedList<Character> list = new LinkedList<>();
		
		System.out.println("Enter a string: ");
		String string = input.nextLine();
		
		for (int i = 0; i < string.length(); i++) { // O(n)
			if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
				list.clear();
			}
			list.add(string.charAt(i));
			
			if (list.size() > link.size()) {
				link.clear();
				link.addAll(list);
			}
		}
		
		System.out.println("Maximum consecutive substring is ");
		
		for (Character ch: link) {
			System.out.print(ch);
		}
	}
}