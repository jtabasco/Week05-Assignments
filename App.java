package Week05;

public class App {

	public static void main(String[] args) {
		//6.a
		//Created instances of AsteriskLogger and SpacedLogger.
		Logger asteriskLogger = new AsteriskLogger(); // creates a variable called AsteriskLogger of type Logger
        Logger spacedLogger = new SpacedLogger(); //creates a variable called SpacedLogger of type Logger
        
		//6.b
        //Called log() and error() with sample strings to show outputs
        System.out.println("asteriskLogger log.");
		asteriskLogger.log("Welcome"); //call to the log method that was specifically implemented within the AsteriskLogger class
		System.out.println();
		
		System.out.println("asteriskLogger error."); 
		asteriskLogger.error("Bad Password"); // call to the error method that was specifically implemented within the AsteriskLogger class
		System.out.println();
		
		System.out.println("SpacerLogger log.");
		spacedLogger.log("Hi, Welcome"); //call to the log method that was specifically implemented within the SpacedLogger class
		System.out.println();
		
		System.out.println("SpacerLogger error.");
		//call to the error method that was specifically implemented within the SpacedLogger class
		spacedLogger.error("Bad user name or password"); 
	}
	
    
	

	
}
