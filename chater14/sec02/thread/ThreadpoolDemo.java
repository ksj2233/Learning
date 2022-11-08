package sec02.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolDemo {

	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("잘가. ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		};
		ExecutorService exec = Executors.newCachedThreadPool();
//		스레드 1개만 만들겠다.
//		ExecutorService exec = Executors.newFixedThreadPool(4);
		// 4개의 스레드를 생성하겠다.
		exec.execute(task);
		// 스레드 풀에 있는 스레드를 사용해 실행 한다.
//		exec.submit(task);
		// execute 대신 submit도 사용할수 있다.

		for (int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
		exec.shutdown(); // 호출하지 않으면 종료되지 않는다.

	}

}
