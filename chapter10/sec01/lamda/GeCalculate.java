package sec01.lamda;

@FunctionalInterface
public interface GeCalculate<T> {
	T cal(T a, T b);
}
