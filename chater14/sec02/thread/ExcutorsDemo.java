package sec02.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorsDemo {

	public static void main(String[] args) {
		Runnable t = () -> {
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (n1 + n2));
		};

//		Thread thread = new Thread(t);
//		thread.start();

		ExecutorService exr = Executors.newSingleThreadExecutor();
//		스레드 1개를 생성한다.
		exr.submit(t);

		System.out.println("End " + Thread.currentThread().getName());
		exr.shutdown();
//		shutdownnow = 현재 작업만 닫는다.
	}

}
