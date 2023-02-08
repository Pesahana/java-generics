package javagenerics;

public class Main {

	public static void main(String[] args) {

	    
	    GenericsClass<Integer> intObj = new GenericsClass<>(5);
	    System.out.println("Generic Class returns: " + intObj.getData());

	   
	    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
	    System.out.println("Generic Class returns: " + stringObj.getData());
	  }
	
}
