package Week05;

public class SpacedLogger implements Logger { //declares the SpacedLogger class and specifies 
											  //that this class implements the Logger interface
	
	

	//5.a
	@Override
	public void log (String message) {
		System.out.println(insertSpace(message)); // call the insertSpace method and print the result
	}
	//5.b
	@Override
	public void error (String message) {
		System.err.println("ERROR: "+insertSpace(message)); // We use System.err for errors

		
	}
	// created the following method because it is common for the log and error that returns the string with spaces between char
	private String insertSpace (String message) {
		String stringWithSpace =""; //We declare variable stringWithSpace and initialize it
		for (int i=0;i<message.length()-1;i++) { // loop to go through the word without the last char
			stringWithSpace+=message.charAt(i)+" "; // We added a space between char 
		}
		stringWithSpace+=message.charAt(message.length()-1); // added the last chat
		return stringWithSpace; 
		
	}

}
