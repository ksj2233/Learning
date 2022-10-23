package assignmentTest08;

import java.util.Scanner;

public class EchoerTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Echoer e = new Echoer() {

			@Override
			void echo() {
				
				do {
					String str = in.nextLine();
					System.out.println(str);
					if (str.equals("끝")) {
						break;
					}
				} while (true);
			}
		};
		
		e.start();
		e.echo();
		e.stop();
		
	}

}
