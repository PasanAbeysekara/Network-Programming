package socket_programming;

public class MultiThreadingRunnables implements Runnable {
	
	private int thread_number;
	
	public MultiThreadingRunnables(int t) {
		this.thread_number = t;
	}

	@Override
	public void run() {
		for(int i=1; i <= 5; i++) {
			System.out.println(thread_number + " : " + i);
			
			//if(thread_number == 2)
			//	throw new RuntimeException();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
