package FifthProblem;

public class FifthProb {

	public static void main(String[] args) {
		String str1 = "Kumar";
		String str2 = "kumar";
		if(str1.equals(str2)) {
			System.out.println("true");;
		} else {
			System.out.println("false");;
		}
		System.out.println(str1.getClass());
		FifthProb fb = new FifthProb();
		System.out.println(fb.toString());

	}
	
	public String toString() {
		return "Hello!";
	}
	
	
//	The final methods in Object Class are :
//		getClass()
//		notify()
//		notifyAll()
//		wait(long timeout, int nanos)
//		wait(long timeout)
//		wait()
//		finalize()
	

}
