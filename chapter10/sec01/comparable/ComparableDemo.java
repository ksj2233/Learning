package sec01.comparable;

import java.util.Arrays;

public class ComparableDemo {

	public static void main(String[] args) {
		Rectangle[] rectangles = { new Rectangle(3, 5), new Rectangle(2, 2), new Rectangle(4, 7) };

		Arrays.sort(rectangles);

		for (Rectangle r : rectangles)
			System.out.println(r);
	}

}
