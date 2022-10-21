package assignmentTest03;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {

		Book[] books = new Book[] { new Book(15000), new Book(50000), new Book(20000) };
//
		System.out.println("정렬 전");
//		
//		for (int i = 0 ; 0 < books.length; i++) {

		int a;
		for (Book b : books) {
			System.out.println(b);
			a = b.getnum();
		}
////		System.out.println();
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
