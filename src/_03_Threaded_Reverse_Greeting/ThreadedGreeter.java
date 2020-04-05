package _03_Threaded_Reverse_Greeting;

public class ThreadedGreeter implements Runnable {

	int threadNumber;
	
	
	ThreadedGreeter(int threadNumber) {
		this.threadNumber = threadNumber;
		run();
	}

	
	
	@Override
	public void run() {
		System.out.println("Hello from thread number: " + threadNumber);
		
		if(threadNumber <= 50) {			
			Thread newThread = new Thread(()->new ThreadedGreeter(threadNumber++));
			newThread.start();
			try {
				newThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
