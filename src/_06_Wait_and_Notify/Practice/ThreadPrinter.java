package _06_Wait_and_Notify.Practice;

public class ThreadPrinter implements Runnable{
	static int totalThreads = 0;
	private int thread;
	public ThreadPrinter() {
		totalThreads++;
		thread = totalThreads;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10000;i++) {
		System.out.println("Thread 2" + thread + " Line 1");
		System.out.println("Incrementing...");
		}
	}
}
