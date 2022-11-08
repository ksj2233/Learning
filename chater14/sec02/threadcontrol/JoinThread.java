package sec02.threadcontrol;

public class JoinThread extends Thread {
	int total;

	public void run() {
		for (int i = 0; i <= 100; i++) {
			total += i;
		}
	}

}
