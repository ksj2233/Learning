package sec04.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = { "포도", "망고", "샤인머스켓", "키위", "수박" };
		List<String> list = Arrays.asList/* List 로 변경해준다. */(fruits);
		System.out.println(list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);

	}

}
