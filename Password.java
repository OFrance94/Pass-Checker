import java.util.Scanner;

public class Password 
{

	public static void main(String[] args) 
	{
		boolean done = false;
			
		do 
		{
		Scanner pInput = new Scanner(System.in);
		System.out.println("Please enter password.");		
		String userinput = pInput.nextLine();
		int len = userinput.length();
		boolean numcheck = false;
		char [] password=userinput.toCharArray();
		
		for (char c : password) 
		{
			if(Character.isDigit(c)) {
				numcheck=true;
				
			}
			else {				
				numcheck=false;					
			}
		}
		if(len>8 && numcheck==true) {
			System.out.println("Your password is acceptable!");
			done = true;
			pInput.close();
		}
		else {
			System.out.println("Your password is too short and/or doesn't contain a number, try again.");
		}
		
		}while(!done);
		
		
		
		

		
		
	}

}
