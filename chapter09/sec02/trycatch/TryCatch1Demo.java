package sec02.trycatch;

public class TryCatch1Demo {

	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			System.out.println("마지막 원쇼 => " + array[1]);
			System.out.println("첫 번째 원쇼 => " + array[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다.");
		} finally {
			System.out.println("finally.");
		}
		System.out.println("어이쿠!!!");

	}

}
