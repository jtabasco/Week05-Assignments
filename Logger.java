package Week05;

//Defined a Logger interface with log() and error() methods. This ensures consistency for all implementing classes.
//The Logger interface guarantees all classes implement log() and error()

public interface Logger { //interface named Logger.
	
    //1.a log void methods to the Logger interface that take string as argument
	public void log(String message);
	//1.b error void methods to the Logger interface that take string as argument
    public void error(String message);

}
