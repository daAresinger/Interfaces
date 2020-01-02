package main;

@FunctionalInterface
interface MyFunctionalInterface {
	
	// this is the only abstract method in this Interface, to emphasise I added the 'abstract' keyword
	abstract public void abstractMethod(); 
	
	default public void interfaceMethod() {
		System.out.println("This method is defined in FunctionalInterface");
	}

}
