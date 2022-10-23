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


	}
// 수정중