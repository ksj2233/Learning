package sec01.checked;

public class CheckedDemo {

	public static void main(String[] args) {
		// Thread.sleep(100);
		// 위 코드는 일반예외가 발생할 수 있는 코드임에도 예외 처리를 하지 않아 컴파일 오류가 발생한다.

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
