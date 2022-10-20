package challengeAssignment;

public class CountableTest_3 {
	public static void main(String[] args) {
		Countable_3[] m = { new Bird_3("뻐꾸기", 5), new Bird_3("독수리", 2), new Tree_3("사과나무", 10), new Tree_3("밤나무", 7) };

		for (Countable_3 e : m)
			e.count();

		for (int i = 0; i < m.length; i++) {
			if (m[i] instanceof Bird_3) {
				((Bird_3) m[i]).fly();
			} else if (m[i] instanceof Tree_3) {
				((Tree_3) m[i]).ripen();
			}

		}

	}
}
