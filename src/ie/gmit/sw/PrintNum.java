package ie.gmit.sw;

public class PrintNum extends Thread{
	private int lastNum; // Instance Variable

	// Thread Constructor
	public PrintNum(int lastNum){
		this.lastNum = lastNum;
	}
	// Run method
	public void run(){
		for (int i=1; i <= lastNum; i++)
			System.out.print(i + "\n"); // Display Thread result to screen, a number between 0 and n(from constructor)
	}
}// End PrintNum Class