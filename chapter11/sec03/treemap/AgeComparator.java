package sec03.treemap;

import java.util.Comparator;

public class AgeComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.intValue() - o1.intValue();
	}

}
