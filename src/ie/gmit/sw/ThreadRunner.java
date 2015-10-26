package ie.gmit.sw;

public class ThreadRunner {

	private static final int WAIT_TIME = 2000; // Declare and Initialise a Static Wait Time for all Threads
	
	public static void main(String[] args) {
		try {
			PrintNum  print100 = new PrintNum(5); // New Thread one object constructed with param
			PrintName printName = new PrintName("Will", 5); // New Thread one object constructed with params
			
			print100.start(); // Print first Thread
			Thread.sleep(WAIT_TIME); // Sleeps for the WAIT_TIME declared above
			printName.start(); // Prints the second Thread
			
		} catch (InterruptedException e) {
			e.printStackTrace(); // Catches any error and prints to screen
		} // End try/catch
		
	} // End main
	
} // End ThreadRunner class