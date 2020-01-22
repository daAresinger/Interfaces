package main;


public interface AnInterface {
	
	public final static int fin = 1; // all global variables in an interface are final and static.
	public int var = 0; // it is enough to declare variables with scope and type keywords, since final and static are implied
	
	// you can define as many abstract methods as you want
	abstract void a();
	void b();
	int c();
	
	// you can define implemented methods as well
	// you may have to look up which access modifiers are allowed (this depends on the static modifier)
	default void interfaceMethod() {
		helperMethod();
		System.out.println("This method is defined in [AnInterface]");
	}
	
	private static void helperMethod() {
		System.out.println("This is my helper method in [AnInterface]");
	}
	
	
	// {compiler error} all static methods need to be defined in the interface
	// abstract static void abstractStaticMethod(); 
}
