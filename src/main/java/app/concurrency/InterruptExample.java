package app.concurrency;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class InterruptExample {
	public static void main(String[] args) {
		System.out.println("Press x to quit.");
		Thread t = new Thread(new ContinueTillInterrupt());
		t.start();
		Scanner input = new Scanner(System.in);
		while (!input.next().equals("x")) {
			System.out.println("Press x to quit.");
		}
		t.interrupt();
		input.close();
	}
}

class ContinueTillInterrupt implements Runnable {

	AtomicInteger count = new AtomicInteger(1);

	@Override
	public void run() {
		while (true) {
			try {
				System.out.printf("I'm alive %d.\n", count.getAndIncrement());
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.printf("%s\n", "I'm dead!");
				return; // close
			}
		}
	}
}

class CheckInterruptEvery5Seconds implements Runnable {

	AtomicInteger count = new AtomicInteger(1);

	@Override
	public void run() {
		while (true) {
			// doing stuff
			if(Thread.interrupted()) {
				return;
			}
		}
	}

}
