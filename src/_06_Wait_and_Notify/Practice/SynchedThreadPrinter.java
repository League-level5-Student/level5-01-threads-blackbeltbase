package _06_Wait_and_Notify.Practice;

public class SynchedThreadPrinter implements Runnable{
	static Object threadLock = new Object();
	static int totalThreads = 0;
	private int thread;
	public SynchedThreadPrinter() {
		totalThreads++;
		thread = totalThreads;
	}
	
	@Override
	public void run() {
		synchronized(threadLock) { 
			for(int i = 0;i< 10000;i++) {
			System.out.println("Thread " + thread + " Line 1 "+i);
			System.out.println("Thread 1 incrementing...");
			threadLock.notify(); 
			try {
				threadLock.wait(); 
			} catch (InterruptedException e) {
				System.out.println("error!");
			}
			}
			
		
		}
	}
}

