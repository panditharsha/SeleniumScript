package Practise_new;

public class Constructor {
		int a ;
		int b ;
		int f ;
	public static void main(String[] args) {
		
		Constructor c =new Constructor(21, 7,150);
		//c.mul();
		 c.add();

		
	}
	 public Constructor(int c ,int d,int g)
	 {
		a=c ;
		b=d;
		f=g;
	 }
	 
	
	public void mul()
	{
		int c =a*b ;
		System.out.println(c);
	}
	
	
	public void add()
	{
		int h =a+b+f;
		System.out.println(h);
	}

}
