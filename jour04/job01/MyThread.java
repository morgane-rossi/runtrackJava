package exosThreads;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		super.run();
		System.out.println("Mon thread est en cours");
	}

}
