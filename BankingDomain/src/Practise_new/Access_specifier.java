package Practise_new;

public class Access_specifier {

	public static void main(String[] args) {
		Access_specifier a =new Access_specifier();
		a.sum();

	}
      private void sum() {
    	 System.out.println("private_method");
     }
      
      
      void sub()
      {
    	  System.out.println("Default method");
      }
}
