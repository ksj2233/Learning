package assignment01;

public class Circle {
	int radius;
	
	Circle (int radius){
		this.radius = radius;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle c = (Circle) obj;
			if (radius == c.radius)
				return true;
		}
		return false;
	}
	
}
