package Practise_new;

public class var1 {
	 static int c =75;
	  int d =500;
	
	
	public static void main(String[] args) {
		
		System.out.println("c is:"+c);
		test1();
		
		var1 v =new var1();
		v.test();
		
		 

		
		
	
	}
	
  public void test()
  {
	  Var2 v2 =new Var2();
	  System.out.println("value of c in nonst methd:"+c);
	  System.out.println("value of d in nonst methd:"+d);
	  System.out.println("value of a from other class:"+v2.a);
  }
  
  public static void test1()
  {
	  System.out.println("value of static c :"+c);
	  
	  var1 v =new var1();
	  System.out.println("value of non static d:"+v.d);
  }
}
