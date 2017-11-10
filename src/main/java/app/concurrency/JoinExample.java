package app.concurrency;

public class JoinExample {
	public static void main(String[] args) throws InterruptedException {
		long duration = 5000l;
		long start = System.currentTimeMillis();
		Thread spammer = new Thread(new SpamEverySecond());
		spammer.start();
		while(spammer.isAlive()) {
			spammer.join(1000);
			if(System.currentTimeMillis() - start > duration) {
				spammer.interrupt();
				spammer.join();
			}
		}
		SpamService.printSpam("Finally killed spam.");
	}
}

class SpamService{
	static void printSpam(String msg) {
		System.out.printf("From %s: %s\n",Thread.currentThread().getName(),msg);
	}
}

class SpamEverySecond implements Runnable{

	final String msg = "This is spam!";
	
	@Override
	public void run() {
		while(true) {
			SpamService.printSpam(msg);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				SpamService.printSpam("Damn, I was interrupted.");
				return;
			}
		}
	}
	
}