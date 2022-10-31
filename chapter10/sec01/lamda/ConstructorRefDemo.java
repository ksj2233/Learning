package sec01.lamda;

interface NewObject<T> {
	T getObject(T o);
}

interface NewArray<T> {
	T[] getArray(int size);
}

public class ConstructorRefDemo {

	public static void main(String[] args) {
		NewObject<String> s;
		NewArray<Integer> i;

		s = new NewObject<String>() {

			@Override
			public String getObject(String o) {
				return new String(o);
			}
		};

		s = o -> new String(o);
		s = String::new;
		System.out.println(s.getObject("Hello"));

		i = new NewArray<Integer>() {

			@Override
			public Integer[] getArray(int size) {
				return new Integer[size];
			}
		};

		i = size -> new Integer[size];

		i = Integer[]::new;
		Integer[] array = i.getArray(6);

		for (int j = 0; j < array.length; j++) {
			array[j] = (int) (Math.random() * 45 + 1);
		}

		for (int k : array) {
			System.out.println(k);
		}

	}

}
