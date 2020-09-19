package day02work;

import day02work.Vehicles;

public class Truck extends Vehicles{
	private float load ;

	public Truck() {
		Vehicles vehicles = new Vehicles();
		load = 38.0f;
		System.out.println(vehicles.brand +"  " +vehicles.color);  //调用显示父类
	}
	public void showTruck() {
		Truck truck = new Truck();
		System.out.println(truck.load);
	}
}
