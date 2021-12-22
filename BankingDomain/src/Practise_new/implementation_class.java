package Practise_new;

public class implementation_class implements interface_Study {

	public static void main(String[] args) {
		implementation_class i =new implementation_class();
		i.call();
		i.sell();

	}

	@Override
	public void sell() {
		System.out.println("selling product ");
		int a =5;
		double b =a;
		System.out.println(+b);
		
	}

	@Override
	public void call() {
		System.out.println("call police");
		double a =20;
		int b =(int) a;
		System.out.println(b);
	}

}
