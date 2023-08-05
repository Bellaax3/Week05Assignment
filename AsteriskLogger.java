package week05Project;

public class AsteriskLogger implements Logger {
	
	@Override
	public void log(String log) {
	
   System.out.print("***" + log + "***");
    
    
    
}
	@Override
	public void error(String error) {
		System.out.println("**********************");
		System.out.println("***  Error : " + error + " ***");
		System.out.println("**********************");
	}
}

	

