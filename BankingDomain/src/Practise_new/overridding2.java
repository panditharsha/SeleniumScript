package Practise_new;

public class overridding2 extends overridding1{

	public static void main(String[] args) {
		
		overridding2 o2 =new overridding2();
		o2.game();
		
		
		overridding1 o1 =new overridding2();
		o1.game();

	}

  public void game()
  {
	  System.out.println("out door game");
  }
}
