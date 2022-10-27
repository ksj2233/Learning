package chellengeassignment.chellenge01;

//	최고 성적을 찾아내는 메서드를 제네릭 메서드로 작성해 보고 , 명령행 인자로
//	주어진 학생의 성적을 찾아내는 프로그램을 작성해서 제네릭 프로그래밍과
//	예외 처리를 도전해 보자.
//	<출력>
//	영어 최고 점수 : 홍길도, 99

public class EnglishScoreTest {

	static EnglishScore findBest(EnglishScore[] a) {
		EnglishScore best = a[0];

		for (int i = 1; i < a.length; i++) {
			if (best.compareTo(a[i]) < 1)
				best = a[i];
		}

		return best;
	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		System.out.println("영어 최고 점수 : " + findBest(ea));

	}

}
