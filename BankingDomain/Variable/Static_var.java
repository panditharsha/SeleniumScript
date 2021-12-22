package Variable;

public class Static_var {
	
	static int  a =120 ;
	
	public static void main(String[] args) {
		Static_var st =new Static_var();
		st.dispaly();
		display1();
		
	}
	public void dispaly() {
		int b =30;
		int sum =a+b ;
		System.out.println("Sum of number:"+sum);
		a =sum;
		System.out.println("a value is:"+a);
			
	}
	
	public static void display1() {
	a =a+50;
	System.out.println("a value in static :"+a);
   }
}
