package week05Project;

public class App {

	public static void main(String[] args) {
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		
		asteriskLogger.log("hey");
		System.out.println();
		asteriskLogger.error("hello");
		System.out.println();
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Hello");
		System.out.println();
		spacedLogger.error("ONE");
		System.out.println();
		

	}

}
