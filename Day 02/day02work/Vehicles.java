package day02work;

public class Vehicles {
	public String brand ;
	public String color ;
	
	public void run() {
		System.out.println("���Ѿ�������");
	}
	
	public Vehicles() {
		super();
		brand =  "����";
		color = "�й���";
	}

	public void showInfo() {
		Vehicles vehicles = new Vehicles();
		System.out.println(vehicles.brand);
		System.out.println(vehicles.color);
	}

}

	