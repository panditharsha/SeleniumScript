package Variable;

public class SV1 {

	static int a =50;  
	int c = 30;
	public static void main(String[] args) {
		
		SV1 sv =new SV1();
		sv.test();
		SV2 sv2 =new SV2();
		System.out.println("value of l is:"+sv2.l);  //other class non static variable call
		System.out.println("value of d is:"+SV2.d);
		System.out.println("*******************************");
		System.out.println("value of a is :>" +a);
		
	}
	public void test() {
		 int b =90 ;        
		 int sum =b+a ;
		 int sub =b-c;
		
		System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b);
		System.out.println("Sum is :"+sum);
		System.out.println("Sub is :"+sub);
		c =c+25;
		System.out.println("value of c is:"+c);
	}

}
