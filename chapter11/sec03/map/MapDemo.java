package sec03.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String/* (K) */, Integer/* (V) */> fruits = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);
		System.out.println(fruits.size() + "종류의 과일이 있습니다.");
		System.out.println(fruits);

		for (String key : fruits.keySet())
			System.out.println(key + "가 " + fruits.get(key)/* Key 값의 Value 를 get 해서 들고 온다 */ + "개 있습니다.");

		String key = "바나나";
		if (fruits.containsKey(key))
			System.out.println(key + "가 " + fruits.get(key) + "개 있습니다.");

		fruits.forEach((k, n) -> System.out.print(k + "(" + n + ") "));

		Map<String, Integer> fruits2 = new HashMap<>();

		fruits2.put("사과", 5);
		fruits2.put("키위", 2);
		fruits2.remove("사과");
		fruits2.forEach((k, n) -> System.out.print(k + "(" + n + ") "));
		fruits2.clear();
		fruits2.forEach((k, n) -> System.out.print(k + "(" + n + ") "));

	}

}
