import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Password 
{

	public static void main(String[] args) 
	{
		List<String> passInput = new LinkedList<String>();
		boolean arraycheck = false;
		Scanner pInput = new Scanner(System.in);
			
		for(int i=5; i>=0; i--) {
			System.out.println("Please enter " + (i+1) + " password/s.");		
			String userinput = pInput.nextLine();
			passInput.add(userinput);
			}
			
		pInput.close();

		
		
		for (String s : passInput) {
			char[] solocheck = s.toCharArray();
			
			for (Character sc : solocheck) {
				if(Character.isDigit(sc)) {
					arraycheck = true;
					break;
				}
				
			}
			if (arraycheck == true && s.length() >= 8){
				System.out.println("Array Password valid!");
			}
			else {
				System.out.println("Array Password invalid.");
			}
		}
		
		
	
	}

}
