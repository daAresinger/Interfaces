package main;

public interface OtherInterface {
		
	public default void interfaceMethod() {
		System.out.println("This method is defined in OtherInterface");
	}
	
	public static void staticMethod() {
		System.out.println("This method is staticly defined in OtherInterface");
	}
}
