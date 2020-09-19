package day02work;

import day02work.Vehicles;

public class Car extends Vehicles{
	private int seats ;

	public Car() {
		Vehicles vehicles = new Vehicles();
		seats = 4;
		System.out.println(vehicles.brand +"  " +vehicles.color);  //调用显示父类
	}
	public void showCar() {
		Car car = new Car();
		System.out.println(car.seats);
	}
}
