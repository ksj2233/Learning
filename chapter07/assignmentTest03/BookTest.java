package assignmentTest03;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {

		int[] books = new int[3];

		int count = 0;
		books[count++] = 15000;
		books[count++] = 50000;
		books[count++] = 20000;

		System.out.println("정렬 전");
		for(int b : books) {
			new Book(b);
		}
		System.out.println();
		Arrays.sort(books);
			
		
		System.out.println("정렬 후");
		for(int b : books) {
			new Book(b);
		}		
		
		
//		Book b = new Book();
	}

}
