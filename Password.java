import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Password {
	static List<String> passInput = new LinkedList<String>();
	static boolean arraycheck = false;
	static Scanner pInput = new Scanner(System.in);
	
	public static void main(String[] args) { // TRY USING HASHMAP?
		
		passwordInput();		
		passCheck();
		pInput.close();

	}
	
	public static void passwordInput() {
		
		System.out.println("Please enter 6 passwords.");

		for (int i = 5; i >= 0; i--) {
			String userinput = pInput.nextLine();
			passInput.add(userinput);
		}
	}
	
	public static void passCheck() {
		for (String s : passInput) {
			char[] solocheck = s.toCharArray();

			for (Character sc : solocheck) {
				if (Character.isDigit(sc)) {
					arraycheck = true;
					break;
				}

			}
			if (arraycheck == true && s.length() > 8) {
				System.out.println("Array Password " + s + " is Very Strong!");
			} else if (arraycheck == true && s.length() >= 5) {
				System.out.println("Array Password " + s + "  Strong!");
			} else if (arraycheck == true && s.length() < 5) {
				System.out.println("Array Password " + s + " needs to be longer.");
			} else if (s.length() >= 8 && !(arraycheck == true)) {
				System.out.println("Array Password " + s + " has good password length, but needs numbers.");
			} else if (s.length() >= 5 && !(arraycheck == true)) {
				System.out.println("Array Password " + s + " should be longer and needs numbers.");
			} else {
				System.out.println("Array password " + s + " invalid.");
			}
		}
	}
}
