package genericsmethods;

public class Main {

	public static void main(String[] args) {

	    
	    DemoClass demo = new DemoClass();

	    
	    demo.<String>genericsMethod("Java Programming");

	    
	    demo.<Integer>genericsMethod(23);
	  }
	
}
