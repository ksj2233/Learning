package sec02.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo2 {

	public static void main(String[] args) {
		Runnable t1 = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0)
					System.out.println(name + " : " + i + " ");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		};
		Runnable t2 = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 1)
					System.out.println(name + " : " + i + " ");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		};

//		Thread tr1 = new Thread(t1);
//		Thread tr2 = new Thread(t2);
//
//		tr1.start();
//		tr2.start();

		ExecutorService exr = Executors.newFixedThreadPool(2);
		exr.submit(t1);
		exr.submit(t2);
		exr.submit(() -> {
			String name = Thread.currentThread().getName();
			System.out.print(name + " " + "먼저끝난 스레드");

		});
		exr.shutdown();
	}

}
