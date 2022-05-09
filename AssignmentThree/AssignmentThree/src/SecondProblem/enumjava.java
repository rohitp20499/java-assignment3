package SecondProblem;

//enum can be declared outside the class also
enum Season { WINTER, SPRING, SUMMER, FALL };  

public class enumjava{  
	public static void main(String[] args) {  
		Season s=Season.WINTER;  
		
		System.out.println(s);  
		
		if(s!=Season.FALL)
		{
			System.out.println("Season is not FALL");
		}
		else
		{
			System.out.println("Season is FALL");
		}
		
		System.out.println("Season is "+myEnum(s));
	}

	public static Season myEnum(Season s) {
		
		return s;
	}
	
	
}   