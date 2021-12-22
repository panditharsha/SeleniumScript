package Practise_new;

public class Var2 {
    
	int a =50;
	static int b =100;
	
	
	public static void main(String[] args) {
        Var2 v =new Var2();
        v.sum();
        
        var1 v1= new var1();
        System.out.println("c is:"+v1.c);         //call value of c (static global var) from var1 class
        
        System.out.println("a is:"+v.a);           //call non static var from same class
        
        
		
	}
   public void sum()
   {
	   System.out.println("value of a is:"+a);
	   System.out.println("value  of b is:"+b);
	   
   }
}
