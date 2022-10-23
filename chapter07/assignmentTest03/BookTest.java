package assignmentTest03;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {

		int[] books = new int[] { 15000, 50000,20000 };
//
		System.out.println("정렬 전");

		for (int b : books) {
			b.show();
		}
		System.out.println();
		
//		Comparator<Book> cmp = new Comparator<Book>() {
//
//			public int compare(Book o1, Book o2) {
//				return o1.length() - o2.length();
//			}
//		};
		Arrays.sort(books);
////
//////		System.out.println("정렬 후");
////		for (Book b : books) {
////			b.show();
////		}
//
////		Book b = new Book();
	}

}
