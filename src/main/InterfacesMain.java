package main;

public class InterfacesMain {

	public static void main(String[] args) {
		// static methods in interfaces can be called like in any class
		OtherInterface.staticMethod();
		
		// we create an object of type [MyClass] and store it in a variable of [AnInterface]
		AnInterface myObject = new MyClass();
		myObject.interfaceMethod();
		myObject.a();
		// now we replace the object in the variable [myObject] with an object of the type [MyOtherClass]
		myObject = new MyOtherClass();
		myObject.a();
	}
	
}
