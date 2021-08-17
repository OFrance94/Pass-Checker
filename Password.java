import java.util.Scanner;

public class Password 
{

	public static void main(String[] args) 
	{
		Scanner pInput = new Scanner(System.in);
		boolean numcheck = false;
		
		
		System.out.println("Please enter password.");
		
		String userinput = pInput.nextLine();
		System.out.println("Your password is "+userinput);
		
		char [] password=userinput.toCharArray();
		
		for (char c : password) {
			if(Character.isDigit(c)) {
				numcheck=true;
				break;
			}
			else {				
				numcheck=false;					
			}
		}	
		
		System.out.println("Your password is "+userinput.length()+" characters long.");
		if (userinput.length()<8) {
			System.out.println("Your password is too short, please make password at least 8 characters long.");
		}
		if(numcheck==false) {
			System.out.println("Your password must contain at least one number.");
		}
		
		
		
	}

}
