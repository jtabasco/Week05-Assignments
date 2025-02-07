package Week05;

public class AsteriskLogger implements Logger { //declares the AsteriskLogger class and specifies
												//that this class implements the Logger interface

	//4.a
	@Override
	 public void log(String message) {
	        System.out.println("***" + message + "***"); //Prints per console *** message *** 
	    }
	 //4.b
	@Override
	 public void error(String message) {
		 	String aster = "*".repeat(message.length() + 13); // +13 for "***ERROR:***" on each side
	        System.err.println(aster); // We use System.err for errors
	        System.err.println("***ERROR: " + message + "***");
	        System.err.println(aster);
	        
	    }

	

}
