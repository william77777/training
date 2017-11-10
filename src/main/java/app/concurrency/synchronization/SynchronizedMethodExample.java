package app.concurrency.synchronization;

public class SynchronizedMethodExample {
	private static int count = 0;
	public synchronized void inc() {count++;}
	public synchronized void dec() {count--;}
	public int value() {return count;}
	
	public static void main(String[] args) {
		new Thread() {

			@Override
			public void run() {
				SynchronizedMethodExample e = new SynchronizedMethodExample();
				e.inc();
				e.inc();
				System.out.printf("%s: Value of count: %d\n",Thread.currentThread().getName(),e.value());
			}
			
		}.start();
		
		new Thread() {

			@Override
			public void run() {
				SynchronizedMethodExample e = new SynchronizedMethodExample();
				e.dec();
				e.dec();
				System.out.printf("%s: Value of count: %d\n",Thread.currentThread().getName(),e.value());
			}
			
		}.start();
	}
}
