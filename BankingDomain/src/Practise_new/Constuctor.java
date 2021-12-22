package Practise_new;

public class Constuctor {
	 
	int a ;
	int b ;
	
	public static void main(String[] args) 
	   {
		
		Constuctor c =new Constuctor(35, 7);
		c.multiplication();
		}
	
	public Constuctor(int x,int y)
	{
		 a =x;
		 b =y;
	}
	
	public void multiplication()
	{
		int mul =a*b;
		System.out.println("Multiplication is:"+mul);
	}
}

