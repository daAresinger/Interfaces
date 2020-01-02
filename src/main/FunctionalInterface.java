package main;

public interface FunctionalInterface {
	
	// this is the only abstract method in this Interface, to emphasise I added the 'abstract' keyword
	abstract public void abstractMethod(); 
	
	public default void interfaceMethod() {
		System.out.println("This method is defined in FunctionalInterface");
	}

}
