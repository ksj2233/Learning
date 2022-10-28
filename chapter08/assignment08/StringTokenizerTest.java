package assignment08;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {
//	<문제>
//	다음 실행 결과처럼 주어진 영어 속담을 단어로 분리해 배열에 저장하고,
//	단어의 개수를 출력하며, 정렬한 후 모든 단어를 출력하는 프로그램을 작성하라.
//	
//	<출력>
//	입력 : Empty vessels make the most sound.
//	단어 개수 : 6
//	정렬된 토큰 : Empty, make, most, sound., the, vessels,
	public static void main(String[] args) {
		String s = "Empty vessels make the most sound.";

		StringTokenizer st = new StringTokenizer(s, " ");
		String[] arr = new String[st.countTokens()];

		System.out.println("입력 : " + s);
		System.out.println("단어 개수 : " + st.countTokens());
		for (int i = 0; i < arr.length; i++)
			arr[i] = st.nextToken();

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

}
