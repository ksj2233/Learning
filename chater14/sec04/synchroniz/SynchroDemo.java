package sec04.synchroniz;

public class SynchroDemo {

	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		new CarThread("뺀지리", car, "서울").start();
		new CarThread("문둥이", car, "부산").start();
		new CarThread("깽깽이", car, "광주").start();

	}

}
