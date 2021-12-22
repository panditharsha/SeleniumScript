package Practise_new;

public class Prac {

	public static void main(String[] args) {
			
		String  s ="madam";
		String r ="";
		
		
		for(int i=0;i<=s.length()-1;i++)
		{
			r =r+s.charAt(i) ;
			
		}
		System.out.println(r);
		
		if(s.equals(r))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}

	}

}
