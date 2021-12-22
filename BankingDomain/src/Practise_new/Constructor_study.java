package Practise_new;

public class Constructor_study {
	
	int a;
	int b;
	int f;

	public static void main(String[] args) {
		Constructor_study v1 =new Constructor_study(45,100, 100);
		v1.add();
		
		Constructor_study v =new Constructor_study();
		System.out.println(v.a);
		System.out.println(v.b);
	
		
	}
	
	public Constructor_study()
	{
	   a=25;
	   b=50;
	}
	
	public Constructor_study(int c ,int d,int e)
	{
		a=c;
		b=d;
		f=e;
	}
	
	
	public void add() 
	{
		int sum =a+b+f;
		System.out.println("addition is:"+sum);
	}

}
