package Chapter14_MethodOverloading;

public class Overloading {
	void sum(String...str) {
        for(String a:str)
            System.out.println(a);
}


	public static void main(String args[]) {
	    Overloading v = new Overloading();
	    v.sum("a","b","c");
	    
	    v.sum();
	    
	    v.sum(new String [2]);
	}


}
