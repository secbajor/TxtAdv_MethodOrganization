
public class Astronaut {

	private String name; 
	private int exp; 
	private int loot; 

	Astronaut(String n, int e, int l){
		name = n; 
		exp = e; 
		loot = l;
		
	}
	
	public void setName(String n){
		name = n; 
	}
	
	public String getName(){
		return name; 
	}
	
	public int getExp(){
		return exp; 
	}
	
	public void setExp(int e){ 
		exp = e; 
	}
	
	public void setLoot(int l){ 
		loot = l; 
	}
	
	public int getLoot()
	{
		return loot; 
	}

}
