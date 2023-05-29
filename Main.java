
public class Main {

	public static void main(String[] args) {
		
		//I answered letter A in the activity
		Car car = new Car();
		car.color = "red";
		car.speed = "3km per hour";
		car.price = "10 million";
		
		System.out.println("Car color: " + car.color + "\n" + "Car speed: " + car.speed + "\n" + "Car price: " + car.price);
		car.tireType();
		car.brand();
		car.drive();
		car.stop();
		
	}

}
