package corejava.basic;

public class ifelse {
	
	
	public static void main(String[] args) {
	int x = 170;
	int y = 1740;
	int z = 70;
	
	if(x == y && y == z)  // x is greater than 10 and less than or equal to 20;
	{
		
		System.out.println("all are equal");
	}
	
	else if((x > y) && (x > z)) // x is greater than 10 and less than or equal to 20;
	{
		System.out.println(x);
		System.out.println(x+ " : X is greater");
	}
	else if((y > x) && (y > z))
		System.out.println(y+" : Y is greater");
	else
		System.out.println(z+" : Z is greater");
	
  
		
	}

}
