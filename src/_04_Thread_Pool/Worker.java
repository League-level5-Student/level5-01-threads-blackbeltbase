package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue <Task> taskQueue;
	Worker(ConcurrentLinkedQueue taskQueue){
		this.taskQueue = taskQueue;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(taskQueue.isEmpty()==false) {
			Task removedTask = taskQueue.remove();
			removedTask.perform();
		}
	}


}
