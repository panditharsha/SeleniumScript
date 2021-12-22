package Practise_new;

public class concrete_cl extends Abstract_cl{

	public static void main(String[] args) {
		concrete_cl cl =new concrete_cl();
		cl.math();
		cl.shop();
		cl.play();

	}

	@Override
	public void shop() {
		System.out.println("how's ur day");
		
	}

	@Override
	public void play() {
		System.out.println("i like tennis");
		
	}
 
  
}
