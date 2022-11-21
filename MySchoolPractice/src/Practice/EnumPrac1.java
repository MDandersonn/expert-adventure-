package Practice;

public class EnumPrac1 {
	private static int americanoCNT=0;
	
	
	enum CoffeeType{
		AMERICANO,
		ICELATTE
	}
	
	public static int countCoffee(CoffeeType a){
		
		if(a==CoffeeType.AMERICANO) {
			
			return ++americanoCNT;
		}
		else return 0;
		
	}

	public static void main(String[] args) {
		for(CoffeeType s : CoffeeType.values()) {
			System.out.println(s);
		}
		
		System.out.println(countCoffee(CoffeeType.AMERICANO));
		System.out.println(countCoffee(CoffeeType.AMERICANO));

	}

}
