package sec01.lamda;

@FunctionalInterface // 함수형 인터페이스
public interface Calculate {
	int cal(int a, int b);

//	double cal(double a, double b); 함수형 메서드는 1개 이상 불가능
	default int add(int a, int b) {
		return a + b;
	}

	// default 메서드는 가능
	static int sub(int a, int b) {
		return a - b;
	}
	// static 메서드 가능
}
