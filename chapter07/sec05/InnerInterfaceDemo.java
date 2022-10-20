package sec05;

class Icon {
	interface Touchable {
		void touch();
	}
}

public class InnerInterfaceDemo implements Icon.Touchable {

	@Override
	public void touch() {
		System.out.println("아이콘을 터치한다.");
	}

	public static void main(String[] args) {

	}

}
