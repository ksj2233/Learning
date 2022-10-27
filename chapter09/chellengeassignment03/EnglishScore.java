package chellengeassignment03;

public class EnglishScore implements Comparable<EnglishScore> {
	String name;
	int score;

	EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return name + ", " + score;
	}

	@Override
	public int compareTo(EnglishScore e) {
		if (this.score > e.score)
			return 1;
		else
			return 0;
	}

}
