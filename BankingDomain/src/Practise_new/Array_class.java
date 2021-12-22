package Practise_new;

public class Array_class {

	public static void main(String[] args) {
		
		String Fruit[]=new String[4];
		
		Fruit[0]="Cherry";
		Fruit[1]="apple";
		Fruit[2]="PineApple";
		Fruit[3]="banana";
		
		int id[] = {1,2,3,4,5};
		
		
		for(int i=0;i<=3;i++)
		{
			System.out.print(id[i]);
			System.out.println(Fruit[i]);
				
		}
	
		for(int i=4;i>=0;i--)
		{
			System.out.println(id[i]);
		}
		
		int mark [][]= {{75,50,80},{50,90,60},{40,35,80}};
		
		for(int i =0;i<=2;i++)
		{
			for (int j =0;j<=2;j++)
			{
				System.out.print(mark[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
