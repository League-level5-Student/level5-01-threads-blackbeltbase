package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{
int cusInt;
public ThreadedGreeter(int i) {
	// TODO Auto-generated constructor stub
	this.cusInt = i;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread newThread = null;
		if(cusInt<=50) {
		newThread = new Thread();	
		}
		newThread.start();
		System.out.println("Hello from thread number: "+cusInt);
	}
	

}
