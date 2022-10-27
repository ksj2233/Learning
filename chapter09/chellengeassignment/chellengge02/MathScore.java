package chellengeassignment.chellengge02;

public class MathScore implements Comparable<MathScore> {
	String name;
	int score;

	MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return name + ", " + score;
	}

	@Override
	public int compareTo(MathScore e) {
		if (this.score > e.score)
			return 1;
		else
			return 0;
	}

}
