@FunctionalInterface
interface MyFunctionalInterface
{
	void Display();
}

//public class Displaying implements MyFunctionalInterface{
//	void
//}


public class FunctionalInterfacePractice {
	public static void main(String [] args) {
		MyFunctionalInterface func = () -> System.out.println("Functional Interface Called");
		func.Display();
	}
	
}
