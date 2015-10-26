package ie.gmit.sw;

public class PrintName extends Thread{
	private String name; // Instance Variable
	private int iterations; // Instance Variable
	
	// Thread Constructor
	public PrintName(String name, int iterations){
		this.name = name;
		this.iterations = iterations;
	}
	// Run method
	public void run(){
		for(int i = 0; i < iterations; i++)
			System.out.println(name); // Print result of Thread to screen, said times in constructor
	}
}// End PrintName Class