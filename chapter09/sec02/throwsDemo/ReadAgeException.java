package sec02.throwsDemo;

public class ReadAgeException extends Exception {

	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}
