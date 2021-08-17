
public class Password 
{

	public static void main(String[] args) 
	{
		String pass="Merlin";
		String pass2="1897";
		String passcheck="Your password is ";
		String fullpass=pass+pass2;
		int length = fullpass.length();
		boolean numcheck = false;
		char [] password=fullpass.toCharArray();
		
		System.out.println(passcheck+pass+pass2);
		
		for (char c : password) {
			if(Character.isDigit(c)) {
				numcheck=true;
				break;
			}
			else {				
				numcheck=false;					
			}
		}	
		
		System.out.println("Your password is "+length+" characters long.");
		
		if(numcheck==true) {
			System.out.println("Your password contains numbers.");
		}
		else {
			System.out.println("Your password does not contain numbers.");
		}
		
		
		
	}

}
