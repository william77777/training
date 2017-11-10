package app.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExample {
	
	// Main class counts as your "main thread"
	public static void main(String[] args) throws InterruptedException {
		System.out.print("Main is also...");
		Thread.sleep(1000);
		System.out.print("a thread\n");
		new Thread(new RunnableThread()).start();
		new ThreadChild().start();
	}
}

/**
 * More general Thread doesn't have to subclass Java {@link Thread}
 * 
 * @author wums
 *
 */
class RunnableThread implements Runnable {

	AtomicInteger count = new AtomicInteger(1);

	@Override
	public void run() {
		while (count.get() < 6) {
			System.out.printf("Thread 1 Running %d%n", count.getAndIncrement());
			try {
				// frees up CPU for other threads
				// not guaranteed
				// can be terminated by interrupts
				// don't rely on this
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

/**
 * {@link Thread} subclasses {@link Runnable}
 * 
 * @author wums
 *
 */
class ThreadChild extends Thread {

	AtomicInteger count = new AtomicInteger(1);

	@Override
	public void run() {
		while (count.get() < 6) {
			System.out.printf("%s Running %d%n",Thread.currentThread().getName(), count.getAndIncrement());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
