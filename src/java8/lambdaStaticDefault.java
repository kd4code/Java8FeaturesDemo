package java8;
/*
 * Lambda Expression mainly used to make multiple statements in one statement. "->" 
 * Lambda Expression can be used when we have Functional Interface i.e. One Abstract method only. 
 * Through Lambda Expression we can give the body to single abstract method
 * Inside Interface since Java 8, we can declare static & default method as well
 * Static method can be only called by Interface name not any reference
 * Default Method can be only called by reference or override by child of Interface
 * If child had override the default method , & want to call parent method then 
 * <Parent interface name>.super.<method name>()
 * */

@FunctionalInterface
interface Student {
	public void hello();// if only one Abstract method is there then it is a Functional interface

	public static void staticMethod() {
		System.out.println("Hello , this is Static Method ..");
	}

	default void defaultMethod() {
		System.out.println("Hello , this is Default Method ..");
	}

}

public class lambdaStaticDefault implements Student {

	public static void main(String[] args) {

		Student st = () -> {
			System.out.println("Hello World,This is java Developer");
		}; // using lambda Expression
		st.hello();
		Student.staticMethod();// Static Method can be called by Interface name only not its reference
		st.defaultMethod();// Default Method can be called by Reference only.

		Student lf = new lambdaStaticDefault();
		lf.hello();// it calls the implemented hello()
		lf.defaultMethod();
		
	}
    
	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello Method , which is implemented");
	}

}
