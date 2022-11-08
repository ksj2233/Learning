package sec02.threadcontrol;

public class StopThread extends Thread {
	public boolean stop;

	@Override
	public void run() {
		while (!stop) {
			System.out.println("실행 중...");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("정상 종료");
	}
}
