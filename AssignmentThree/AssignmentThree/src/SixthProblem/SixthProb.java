package SixthProblem;

class NextProb  {
	
	public static void printSomething() {
		System.out.println("Printing .....from base static");
	}
	public void print() {
		System.out.println("printing from Base Non-Instance method");
	}
	
}

public class SixthProb extends NextProb{

//	static method overriding
	public static void printSomething() {
		System.out.println("Printing .....from derived static");
	}
	public void print() {
		System.out.println("Printing from Derive Non-Instance method");
	}
	
	public static void main(String[] args) {
		NextProb sp = new SixthProb();
//		calling inherited static method
		sp.printSomething();
		sp.print();
	}

}

