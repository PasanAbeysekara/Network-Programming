package socket_programming;

public class MultiThreading extends Thread {
	
	private int thread_number;
	
	public MultiThreading(int t) {
		this.thread_number = t;
	}

	@Override
	public void run() {
		for(int i=1; i <= 5; i++) {
			System.out.println(thread_number + " : " + i);
			
			if(thread_number == 2)
				throw new RuntimeException();
			try {
				Thread.sleep(1000); //ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
