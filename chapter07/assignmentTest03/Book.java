package assignmentTest03;

public class Book {
	int price;

	Book(int price) {
		this.price = price;
	}

	int getnum() {
		return price;
	}

	void show() {
		System.out.printf("Book [price=%d]\n", price);
	}

	void sort(Book[] books) {
		int temp = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getnum() > books[i + 1].getnum()) {
				temp = books[i].getnum();

			}

		}
	}
}
// 수정중