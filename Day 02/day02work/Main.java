package day02work;
import day02work.Vehicles;
import day02work.Car;
import day02work.Truck;

public class Main {
	public static void main(String[] args) {
		Vehicles vehicles = new Vehicles();
		Car car = new Car();
		Truck truck = new Truck();
		vehicles.showInfo();
		car.showCar();
		truck.showTruck();
		
	}

}
