package Variable;

public class Global_var {
	    	
	
		int  b =50;
		
	public static void main(String[] args) {
		Global_var gv =new Global_var();
	    gv.display();
	    gv.display1();

	}
	
    public void display() {
    	int a =50;
    	int sum =a+25;
    	System.out.println(sum);
    }
    public void display1() {
    	int mul =b*12;
    	b =mul;
    	System.out.println(mul);
    	System.out.println(b);
    }
}
