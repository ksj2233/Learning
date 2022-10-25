package challengeAssignment;

public class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}

//
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car c = (Car) obj;
			if (model.equals(c.model))
				return true;
		}
		return false;
	}

	public String toString() {
		return model;
	}

}
