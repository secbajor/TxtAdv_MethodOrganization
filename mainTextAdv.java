import java.util.Scanner;


public class mainTextAdv {
	
	static Scanner in = new Scanner (System.in);
	static Astronaut player = new Astronaut("Bob", 10, 10); 

	public static void method1(Astronaut p)
	{
		System.out.println("At the start of method1, loot is: "+p.getLoot()); 
		p.setLoot((p.getLoot())+100);
		System.out.println("At the end of method1, loot is: "+p.getLoot()); 
		
		System.out.println("Choose 2 or 3! ");
		
		int x = in.nextInt(); 
		if(x==2)
		{
			method2(p);
		}
		else if(x==3)
		{
			method3(p); 
		}
	}
	
	public static void method2(Astronaut p)
	{
		System.out.println("At the start of method2, loot is: "+p.getLoot()); 
		p.setLoot((p.getLoot())+100);
		System.out.println("At the end of method2, loot is: "+p.getLoot()); 
		
		 
	}
	
	public static void method3(Astronaut p)
	{
		System.out.println("Now in method3");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Choose 1 or 2!"); 
		int x = in.nextInt(); 
		
		
		if(x==1)
		{
			method1(player); 
		}
		else if(x==2)
		{
			method2(player); 
		}

	}

}
