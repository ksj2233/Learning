package sec02.trycatch;

public class TayCatch3Demo {

	public static void main(String[] args) {
		Reso reso = new Reso();

		try (reso) {
			reso.show();
		} catch (Exception e) {
			System.out.println("예외 처리");
		}

		reso.show();

	}

}

class Reso implements AutoCloseable {

	void show() {
		System.out.println("자원 사용");
	}

	@Override
	public void close() throws Exception {
		System.out.println("자원 닫기");
	}

}