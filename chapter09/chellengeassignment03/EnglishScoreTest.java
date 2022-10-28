package chellengeassignment03;

//	최고 성적을 찾아내는 메서드를 제네릭 메서드로 작성해 보고 , 명령행 인자로
//	주어진 학생의 성적을 찾아내는 프로그램을 작성해서 제네릭 프로그래밍과
//	예외 처리를 도전해 보자.
//	<출력>
//	영어 최고 점수 : 홍길도, 99

public class EnglishScoreTest {

	static <T> T findScore(T[] a, String name) {
		T score = null;
		for (int i = 0; i < a.length; i++) {
			if (a[i].toString().substring(0, 3).equals(name)) {
				score = a[i];
				break;
			}

		}
		return score;
	}

	static <T extends Comparable<T>> T findBest(T[] a) {
		T best = a[0];

		for (int i = 1; i < a.length; i++) {
			if (best.compareTo(a[i]) < 1)
				best = a[i];
		}

		return best;
	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장열실", 98), new MathScore("홍길동", 70) };
		String name = null;

		System.out.println("영어 최고 점수 : " + findBest(ea));
		System.out.println("수학 최고 점수 : " + findBest(ma));
		// args에 이름이 없을 때 예외 처리 코드
		try {
			name = args[0];
			System.out.println("영어		점수 : " + findScore(ea, name));
			System.out.println("수학		점수 : " + findScore(ma, name));

		} catch (Exception e) {
			System.out.println("명령행 인자가 없습니다.");
		}
	}

}
