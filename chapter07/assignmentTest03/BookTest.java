package assignmentTest03;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {

		int[] books = new int[3]; // int타입 배열이 아닌 Book 클래스 타입 배열로 변경

		System.out.println("정렬 전");
		int num = 0;
		books[num++] = 15000;
		books[num++] = 50000;
		books[num++] = 20000;

		for (int b : books) {
			new Book(b);
		}
		System.out.println();

		Arrays.sort(books);

		System.out.println("정렬 후");
		for (int b : books) {
			new Book(b);
		}

	}

}
/*
 * <문제> 가격 순서대로 정렬할 수 있는 Book 클래스와 다음 실행 결과가 나타나도록 테스트 프로그램을 작성하라. Book 클래스에는
 * int 타입의 price 필드가 있으며, 생성자와 필요한 메서드를 포함한다. 또 테스트 프로그램은 3개의 Book 객체로 구성된 Book
 * 배열을 사용해 가격 순서대로 정렬한 후 출력한다.
 */

//  <출력>
//  정렬 전
//  Book [price = 15000]
//  Book [price = 50000]
//  Book [price = 20000]
//  
//  정렬 후
//  Book [price = 15000]
//  Book [price = 20000]
//  Book [price = 50000]
