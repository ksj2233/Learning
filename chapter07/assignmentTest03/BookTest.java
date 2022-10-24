package assignmentTest03;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {

		int[] books = new int[3];

		System.out.println("정렬 전");
		int num = 0;
		books[num++] = 15000;
		books[num++] = 50000;
		books[num++] = 20000;

		for (int b : books) {
			new Book(b);
		}
		System.out.println();

//		Comparator<Book> cmp = new Comparator<Book>() {
//
//			public int compare(Book o1, Book o2) {
//				return o1.length() - o2.length();
//			}
//		};
		Arrays.sort(books);

		System.out.println("정렬 후");
		for (int b : books) {
			new Book(b);
		}

//		Book b = new Book();
	}

}
