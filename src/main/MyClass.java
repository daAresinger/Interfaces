package main;

public class MyClass implements AnInterface, OtherInterface{

	// interfaceMethod is present in both AnInterface and OtherInterface, as such this class needs to override these methods
	@Override
	public void interfaceMethod() {
		AnInterface.super.interfaceMethod(); // using this call we can still use the implementation from AnInterface 
	}

	//The following methods are required by AnInterface
	
	@Override
	public void a() {
		System.out.println("This is [MyClass] speaking");
	}

	@Override
	public void b() {
	}
	
	// int c(); is required by both AnInterface and OtherInterface
	@Override
	public int c() {
		return 0;
	}

}
