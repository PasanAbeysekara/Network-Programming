package socket_programming;

public class ThreadHandler {

	public static void main(String[] args) {
		/*MultiThreading t1 = new MultiThreading(1);
		MultiThreading t2 = new MultiThreading(2);
		MultiThreading t3 = new MultiThreading(3);
		t1.start();
		t2.start();
		t3.start();*/
		
		//throw new RuntimeException();
		
		MultiThreadingRunnables t1 = new MultiThreadingRunnables(1);
		MultiThreadingRunnables t2 = new MultiThreadingRunnables(2);
		MultiThreadingRunnables t3 = new MultiThreadingRunnables(3);
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
		
		/*
		for (int i =1 ; i<=3; i++){
			MultiThreadingRunnables t = new MultiThreadingRunnables(i);
			Thread th = new Thread(t);
			th.start();
			th.join() //wait until other threads are complete.	
		}
		*/
		
	}

}
