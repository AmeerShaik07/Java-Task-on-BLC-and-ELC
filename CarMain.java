package Com.Example;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		car.setCarDetails("Swift", "Maruthi", 600000.0);
		String res = car.getCarDetails();
		System.out.println(res);
	}
}
