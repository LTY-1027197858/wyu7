package day02work;

public class Vehicles {
	public String brand ;
	public String color ;
	
	public void run() {
		System.out.println("我已经开动了");
	}
	
	public Vehicles() {
		super();
		brand =  "红旗";
		color = "中国红";
	}

	public void showInfo() {
		Vehicles vehicles = new Vehicles();
		System.out.println(vehicles.brand);
		System.out.println(vehicles.color);
	}

}

	