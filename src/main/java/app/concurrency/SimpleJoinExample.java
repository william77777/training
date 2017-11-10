package app.concurrency;

public class SimpleJoinExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadChild());
		Thread t2 = new Thread(new ThreadChild());
		t1.start();
		t2.start();
		
		while(true) {
			try {
				t1.join(); // waits for first thread
				System.out.printf("%s stopped %s\n",Thread.currentThread().getName(),t1.getName());
				t2.join(); // waits for second thread
				System.out.printf("%s stopped %s\n",Thread.currentThread().getName(),t2.getName());
				break; // exits infinite loop
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
